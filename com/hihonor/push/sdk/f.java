package com.hihonor.push.sdk;

import android.content.Intent;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f implements Callable<d> {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f7273a;

    public f(Intent intent) {
        this.f7273a = intent;
    }

    @Override // java.util.concurrent.Callable
    public d call() throws Exception {
        byte[] bArr;
        String str;
        Intent intent = this.f7273a;
        if (intent != null) {
            long j = 0;
            try {
                j = intent.getLongExtra("msg_id", 0L);
            } catch (Exception e) {
                g.a("PassByMsgIntentParser", "parserMsgId", e);
            }
            try {
                bArr = this.f7273a.getByteArrayExtra("msg_content");
            } catch (Exception e2) {
                g.a("PassByMsgIntentParser", "parseMsgContent", e2);
                bArr = null;
            }
            Inflater inflater = new Inflater();
            inflater.setInput(bArr);
            byte[] bArr2 = new byte[256];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            while (!inflater.finished()) {
                try {
                    byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                } catch (DataFormatException unused) {
                    inflater.end();
                    str = null;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            }
            inflater.end();
            str = byteArrayOutputStream.toString("utf-8");
            if (str == null) {
                return null;
            }
            String optString = new JSONObject(str).optString("data");
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            d dVar = new d();
            dVar.a(j);
            dVar.a(optString);
            return dVar;
        }
        return null;
    }
}
