import { HTTP_INTERCEPTORS, provideHttpClient, withFetch, withInterceptorsFromDi } from '@angular/common/http';
import { importProvidersFrom } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule, bootstrapApplication } from '@angular/platform-browser';
import { provideRouter, withComponentInputBinding } from '@angular/router';
import { routes } from './app/app-routing.module';
import { AppComponent } from './app/app.component';
import { AppHttpInterceptor } from './app/http-interceptor';

bootstrapApplication(AppComponent, {
  providers: [
    importProvidersFrom(BrowserModule, FormsModule),
    provideRouter(routes, withComponentInputBinding()),
    { useClass: AppHttpInterceptor, provide: HTTP_INTERCEPTORS, multi: true },
    provideHttpClient(withInterceptorsFromDi(), withFetch()),
  ],
}).catch((err) => console.error(err));
