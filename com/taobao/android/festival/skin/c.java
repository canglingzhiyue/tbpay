package com.taobao.android.festival.skin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.utils.TrackUtils;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.gjb;
import tb.gjd;
import tb.gje;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements gjd.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SkinConfig f12367a;
    private final Map<String, Map<String, String>> b;

    static {
        kge.a(2016553561);
        kge.a(-768465082);
    }

    public static /* synthetic */ SkinConfig a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinConfig) ipChange.ipc$dispatch("d4218166", new Object[]{cVar}) : cVar.f12367a;
    }

    public c(SkinConfig skinConfig, Map<String, Map<String, String>> map) {
        this.f12367a = skinConfig;
        this.b = map;
    }

    @Override // tb.gjd.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        gje.a().a(this.b);
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.festival.skin.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!gjb.c(c.a(c.this).skinCode)) {
                } else {
                    gjb.e(c.a(c.this).skinCode);
                }
            }
        });
        b.a().d();
        TLog.loge("festival", "", "notifyUpdate");
    }

    @Override // tb.gjd.c
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (gjd.TYPE_PHENIX.equals(str)) {
            TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_PHENIX_PREFETCH_ERROR, str2);
        } else {
            TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_ZIP_PREFETCH_ERROR, str2);
        }
    }
}
