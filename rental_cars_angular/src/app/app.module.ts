import { BrowserModule, EVENT_MANAGER_PLUGINS } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { AppRoutingModule } from "./app-routing.module";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { ɵBrowserAnimationBuilder } from "@angular/animations";
import { NgModule } from "@angular/core";
import { registerLocaleData } from "@angular/common";
import { NgZorroImportsModule } from "./NgZorroImportsModule";


registerLocaleData();


@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        SignupComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        HttpClientModule,
        ReactiveFormsModule,
        NgZorroImportsModule
    ],
    
    bootstrap: [AppComponent]
})
export class AppModule{ }