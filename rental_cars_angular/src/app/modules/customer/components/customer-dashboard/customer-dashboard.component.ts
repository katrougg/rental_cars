import { Component } from "@angular/core";
import { CustomerService } from "../../service/customer-service";

@Component({
    selector: 'app-customer-dashboard',
    templateUrl: './customer-dashboard.component.html',
    styleUrls: ['./customer-dashboard.component.css']
})

export class CustomerDashboardComponent {

    cars: any = [];
    constructor(private service: CustomerService) {}

    ngOnInit() {
        this.getAllCars();

    }

    getAllCars() {
        this.service.getAllCars().subscribe((res) => {
            console.log(res);
            res.forEach((element: { processedImg: string; returnedImage: string; }) => {
                element.processedImg = 'data:image/jpeg;' + element.returnedImage;
                this.cars.push(element);
            });
        })
    }

}