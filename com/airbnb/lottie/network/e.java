package com.airbnb.lottie.network;

import android.util.Pair;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.n;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import tb.akh;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final d f1783a;
    private final c b;

    public e(d dVar, c cVar) {
        this.f1783a = dVar;
        this.b = cVar;
    }

    private n<g> a(String str, InputStream inputStream, String str2) throws IOException {
        return str2 == null ? h.b(new ZipInputStream(inputStream), (String) null) : h.b(new ZipInputStream(new FileInputStream(this.f1783a.a(str, inputStream, FileExtension.ZIP))), str);
    }

    private n<g> a(String str, InputStream inputStream, String str2, String str3) throws IOException {
        FileExtension fileExtension;
        n<g> a2;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            akh.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            a2 = a(str, inputStream, str3);
        } else {
            akh.a("Received json response.");
            fileExtension = FileExtension.JSON;
            a2 = b(str, inputStream, str3);
        }
        if (str3 != null && a2.a() != null) {
            this.f1783a.a(str, fileExtension);
        }
        return a2;
    }

    private g b(String str, String str2) {
        Pair<FileExtension, InputStream> a2;
        if (str2 == null || (a2 = this.f1783a.a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) a2.first;
        InputStream inputStream = (InputStream) a2.second;
        n<g> b = fileExtension == FileExtension.ZIP ? h.b(new ZipInputStream(inputStream), str) : h.b(inputStream, str);
        if (b.a() == null) {
            return null;
        }
        return b.a();
    }

    private n<g> b(String str, InputStream inputStream, String str2) throws IOException {
        return str2 == null ? h.b(inputStream, (String) null) : h.b(new FileInputStream(this.f1783a.a(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    private n<g> c(String str, String str2) {
        akh.c("Fetching " + str);
        a aVar = null;
        try {
            try {
                a a2 = this.b.a(str);
                if (!a2.a()) {
                    n<g> nVar = new n<>(new IllegalArgumentException(a2.d()));
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e) {
                            akh.b("LottieFetchResult close failed ", e);
                        }
                    }
                    return nVar;
                }
                n<g> a3 = a(str, a2.b(), a2.c(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(a3.a() != null);
                akh.a(sb.toString());
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (IOException e2) {
                        akh.b("LottieFetchResult close failed ", e2);
                    }
                }
                return a3;
            } catch (Exception e3) {
                n<g> nVar2 = new n<>(e3);
                if (0 != 0) {
                    try {
                        aVar.close();
                    } catch (IOException e4) {
                        akh.b("LottieFetchResult close failed ", e4);
                    }
                }
                return nVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    aVar.close();
                } catch (IOException e5) {
                    akh.b("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    public n<g> a(String str, String str2) {
        g b = b(str, str2);
        if (b != null) {
            return new n<>(b);
        }
        akh.a("Animation for " + str + " not found in cache. Fetching from network.");
        return c(str, str2);
    }
}
