package com.alibaba.android.spindle.stage;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.media.MediaConstant;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import tb.bpp;

/* loaded from: classes2.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2424a;
    private String b;
    private String c;
    private JSONObject d;

    public c(String str, String str2, String str3, JSONObject jSONObject) {
        this.f2424a = str;
        this.d = jSONObject;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            String jSONObject = this.d.toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(jSONObject.getBytes("UTF-8"));
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            int length = encodeToString.length();
            if (length <= 15360) {
                a(-1, encodeToString);
                return;
            }
            int i2 = 0;
            while (i < length) {
                int i3 = i + MediaConstant.MAX_BUFFER_SIZE_DEFAULT;
                a(i2, encodeToString.substring(i, Math.min(i3, length)));
                i2++;
                i = i3;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        String format = String.format("%s_%d", this.f2424a, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("index", format);
        hashMap.put(InputFrame3.TYPE_RESPONSE, str);
        bpp.a().commitFailure(InputFrame3.TYPE_RESPONSE, this.f2424a, "", this.b, this.c, hashMap, "UmbrellaTrace", "场景诊断");
    }
}
