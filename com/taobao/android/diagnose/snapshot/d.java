package com.taobao.android.diagnose.snapshot;

import android.os.FileObserver;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class d extends FileObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f11728a;
    private final a b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1096373323);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(String str, a aVar) {
        super(str, (int) LogType.UNEXP_OTHER);
        this.f11728a = str;
        this.b = aVar;
        v.a("NativeCrashFileObserver", "NativeCrashFileObserver init: " + str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
        } else if (i != 256) {
        } else {
            try {
                a(str);
            } catch (Exception e) {
                v.a("NativeCrashFileObserver", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, e);
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            TLog.loge("NativeCrashFileObserver", "", "The file had been created: " + this.f11728a + File.separator + str);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if (str.endsWith("jni.log")) {
                this.b.a();
            } else if (!str.endsWith("anr.log")) {
            } else {
                this.b.b();
            }
        }
    }
}
