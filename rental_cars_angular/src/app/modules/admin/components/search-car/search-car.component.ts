import { Component, ɵprovideZonelessChangeDetection } from "@angular/core";
import { FormBuilder, FormGroup } from "@angular/forms";
import { AdminService } from "../../services/admin.service";

@Component({
    selector: 'app-search-car',
    templateUrl: './search-car.component.html',
    styleUrls: ['./search-car.component.css']
})

export class SearchCarComponent {
    searchCarForm!: FormGroup;
    listOfOption: Array<{ label: string; value: string}> = [];
    listOfBrands = ["BMW", "AUDI", "OPEL", "TOYOTA", "PEUGEOT", "NISSAN", "FORD", "SUZUKI"];
    listOfType = ["Petrol", "Hybrid", "Diesel", "Electric"];
    listOfColor = ["White", "Red", "Black", "Silver", "Grey", "Blue"];
    listOfTransmission = ["Manual", "Automatic"];
    isSpinning = false;
    cars: any;


    constructor(private fb: FormBuilder,
        private service: AdminService
    ) {
        this.searchCarForm = this.fb.group({
            brand: [null],
            type: [null],
            transmission: [null],
            color: [null],
        })
    }

    searchCar() {
        this.isSpinning = true;
        this.service.searchCar(this.searchCarForm.value).subscribe((res) => {
           
            res.carDtoListforEach((element: { processedImg: string; returnedImage: string; }) => {
                element.processedImg = 'data:image/jpeg;base64,' + element.returnedImage;
                this.cars.push(element);

            });
            this.isSpinning = false;
        })
    }
}