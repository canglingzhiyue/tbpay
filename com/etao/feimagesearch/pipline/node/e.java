package com.etao.feimagesearch.pipline.node;

import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.util.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-146248915);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_MOCK_RESPONSE;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        Map<String, String> f = pipLineDS.f();
        if (f != null && (true ^ f.isEmpty())) {
            hashMap.putAll(w.a(pipLineDS.n(), pipLineDS.f()));
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("appId", "21834");
        hashMap2.put("apiVersion", "1.0");
        JSONObject f2 = f();
        com.etao.feimagesearch.newresult.perf.a.k(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        com.etao.feimagesearch.newresult.base.c a2 = com.etao.feimagesearch.newresult.base.c.Companion.a(f2);
        a2.a(hashMap2);
        return a(a2);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    private final JSONObject f() {
        JSONObject resultObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        q.a((Object) externalStorageDirectory, "Environment.getExternalStorageDirectory()");
        sb.append(externalStorageDirectory.getAbsolutePath());
        sb.append("/pltTask/mock.txt");
        File file = new File(sb.toString());
        if (!file.exists() || !file.isFile()) {
            return new JSONObject();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                while (true) {
                    ?? readLine = bufferedReader.readLine();
                    objectRef.element = readLine;
                    if (readLine == 0) {
                        break;
                    } else if (!TextUtils.isEmpty((String) objectRef.element)) {
                        sb2.append((String) objectRef.element);
                    }
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileInputStream.close();
        if (sb2.length() == 0) {
            z = true;
        }
        if (z) {
            return new JSONObject();
        }
        try {
            resultObject = JSON.parseObject(sb2.toString());
        } catch (Exception unused) {
            resultObject = new JSONObject();
        }
        q.a((Object) resultObject, "resultObject");
        return resultObject;
    }
}
