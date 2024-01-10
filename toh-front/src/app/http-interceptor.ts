
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
@Injectable()
export class AppHttpInterceptor implements HttpInterceptor {
    constructor() {
    }

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        const httpRequest = {url: '/toh/api/' + req.url};
        req = Object.assign(req, httpRequest);
        const dupReq = req.clone();
        return next.handle(dupReq);
    }
}