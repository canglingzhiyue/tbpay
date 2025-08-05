package com.ap.zoloz.hummer.common;

import android.content.Context;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cjn;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static h f6466a;
    private RecordProcessor b;

    static {
        kge.a(813216846);
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ec704e23", new Object[0]);
        }
        if (f6466a == null) {
            synchronized (h.class) {
                if (f6466a == null) {
                    f6466a = new h();
                }
            }
        }
        return f6466a;
    }

    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        String str = map.get("hummerId");
        String str2 = map.get("bizId");
        this.b = RecordProcessor.getInstance();
        if (this.b == null) {
            this.b = RecordProcessor.createInstance(context);
        }
        if (!StringUtil.isNullorEmpty(str)) {
            this.b.addExtProperty(cjn.ZIM_IDENTIFY_EKYCID, str);
            this.b.setUniqueID(str);
        } else if (!StringUtil.isNullorEmpty(str2)) {
            this.b.setUniqueID(str2);
        }
        this.b.setDestroyable(false);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RecordProcessor recordProcessor = this.b;
        if (recordProcessor != null) {
            recordProcessor.destroy();
            this.b = null;
        }
        f6466a = null;
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        RecordProcessor recordProcessor = this.b;
        if (recordProcessor == null) {
            return;
        }
        recordProcessor.record(new MetaRecord("", "event", "20001117", str, 1), map);
    }
}
