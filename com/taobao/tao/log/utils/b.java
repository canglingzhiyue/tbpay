package com.taobao.tao.log.utils;

import android.os.FileObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class b extends FileObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f20703a;

    static {
        kge.a(-1632167637);
    }

    public b(String str) {
        super(str, 3904);
        this.f20703a = str;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            return;
        }
        if (str != null) {
            try {
                if (str.contains(File.separator) || !str.endsWith(a.LOG_SUFFIX_TLOG) || !str.contains(a.LOG_SUFFIX_TLOG)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 64) {
            TLog.loge("TLogFileObserver", "", "The file had been moved: " + this.f20703a + File.separator + str);
        } else if (i == 256) {
            TLog.loge("TLogFileObserver", "", "The file had been created: " + this.f20703a + File.separator + str);
        } else if (i == 512) {
            TLog.loge("TLogFileObserver", "", "The file had been deleted: " + this.f20703a + File.separator + str);
        } else if (i == 1024) {
            TLog.loge("TLogFileObserver", "", "The log dir had been deleted: " + this.f20703a);
        } else if (i != 2048) {
        } else {
            TLog.loge("TLogFileObserver", "", "The log dir had been moved: " + this.f20703a);
        }
    }
}
