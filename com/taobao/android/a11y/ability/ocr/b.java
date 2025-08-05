package com.taobao.android.a11y.ability.ocr;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import tb.djv;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final b f8615a;
    private static final LruCache<String, OCRResultData> b;

    static {
        kge.a(-601139665);
        f8615a = new b();
        b = new LruCache<>(20);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("39444bf1", new Object[0]) : f8615a;
    }

    public void a(String str, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a99b64", new Object[]{this, str, oCRResultData});
        } else if (oCRResultData == null) {
        } else {
            b.put(djv.d(str), oCRResultData);
        }
    }

    public OCRResultData a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OCRResultData) ipChange.ipc$dispatch("519938f8", new Object[]{this, str}) : b.get(djv.d(str));
    }
}
