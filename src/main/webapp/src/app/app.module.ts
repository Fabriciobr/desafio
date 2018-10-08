import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {RegistroGridComponent} from "./registro/registro-grid.component";
import {HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";

@NgModule({
    declarations: [
        AppComponent,
        RegistroGridComponent
    ],
    imports: [
        FormsModule,
        BrowserModule,
        HttpClientModule,
        CommonModule,

    ],
    exports: [],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
