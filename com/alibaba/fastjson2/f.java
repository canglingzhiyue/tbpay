package com.alibaba.fastjson2;

import com.alibaba.fastjson2.g;
import java.util.ArrayList;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    final String f2944a;
    final JSONReader b;
    final boolean c;

    static {
        kge.a(-1075954546);
    }

    public f(String str) {
        boolean z;
        this.f2944a = str;
        this.b = JSONReader.a(str, d.f2942a);
        if (this.b.d != '-') {
            if (this.b.d == '$') {
                this.b.D();
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            return;
        }
        throw new JSONException("not support '-'");
    }

    private g b() {
        g iVar;
        this.b.D();
        char c = this.b.d;
        if (c == '\"' || c == '\'') {
            String az = this.b.az();
            if (this.b.a() != ']') {
                if (this.b.z()) {
                    throw new JSONException("not support multi name");
                }
                throw new JSONException("TODO : " + this.b.a());
            }
            iVar = new i(az, com.alibaba.fastjson2.util.c.b(az));
        } else if (c == '*') {
            throw new JSONException("not support *");
        } else {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    int R = this.b.R();
                    if (this.b.d == ':') {
                        throw new JSONException("not support range index ':'");
                    }
                    if (this.b.y()) {
                        throw new JSONException("not support");
                    }
                    iVar = h.a(R);
                    break;
                case ':':
                    throw new JSONException("not support range index ':'");
                default:
                    throw new JSONException("TODO : " + this.b.a());
            }
        }
        if (this.b.r()) {
            return iVar;
        }
        throw new JSONException(this.b.d("jsonpath syntax error"));
    }

    private g c() {
        if (this.b.d != '*') {
            if (this.b.d == '.') {
                throw new JSONException("not support jsonpath ..");
            }
            long L = this.b.L();
            String J = this.b.J();
            if (this.b.d == '(') {
                throw new JSONException("not support jsonpath function");
            }
            return new i(J, L);
        }
        throw new JSONException("not support *");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d a() {
        g gVar;
        if (!this.c || this.b.d != 26) {
            ArrayList arrayList = new ArrayList();
            while (this.b.d != 26) {
                char c = this.b.d;
                if (c == '.') {
                    this.b.D();
                } else {
                    if (c == '[') {
                        gVar = b();
                    } else if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != '_')) {
                        if (c != '@') {
                            throw new JSONException("not support " + c);
                        }
                        this.b.D();
                        gVar = g.a.f2945a;
                    }
                    arrayList.add(gVar);
                }
                gVar = c();
                arrayList.add(gVar);
            }
            return new d(this.f2944a, arrayList, false, false);
        }
        return d.e;
    }
}
