package com.taobao.android.change.app.icon.utils;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME = "auto_repair_more_icons_in_bg_last_time";
    public static final String SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT = "auto_repair_more_icons_in_bg_history_attempt_count";
    public static final String SP_KEY_EXPECT_APP_ICON_MODEL = "expect_app_icon_model";
    public static final String SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED = "is_upload_change_infos_finished";
    public static final String SP_KEY_ORANGE_LAST_VERSION = "orange_last_version";
    public static final String TAG = "ChangeAppIconSP";

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f9324a;
    private SharedPreferences b = igc.b().getSharedPreferences("change_icon", 0);
    private SharedPreferences.Editor c = this.b.edit();

    static {
        kge.a(717581765);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3adbbe12", new Object[0]);
        }
        if (f9324a == null) {
            synchronized (e.class) {
                if (f9324a == null) {
                    f9324a = new e();
                }
            }
        }
        return f9324a;
    }

    private e() {
    }

    public SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[]{this}) : this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.commit();
        AdapterForTLog.loge(TAG, "commit");
    }

    public e a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ca3e387e", new Object[]{this, str, str2});
        }
        this.c.putString(str, str2);
        AdapterForTLog.loge(TAG, "putString key:" + str + " value:" + str2);
        return this;
    }

    public e a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4c1e7558", new Object[]{this, str, new Boolean(z)});
        }
        this.c.putBoolean(str, z);
        AdapterForTLog.loge(TAG, "putBoolean key:" + str + " value:" + z);
        return this;
    }

    public e a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("fb2e0dc9", new Object[]{this, str, new Integer(i)});
        }
        this.c.putInt(str, i);
        AdapterForTLog.loge(TAG, "putInt key:" + str + " value:" + i);
        return this;
    }

    public e a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b4a59b68", new Object[]{this, str, new Long(j)});
        }
        this.c.putLong(str, j);
        AdapterForTLog.loge(TAG, "putInt key:" + str + " value:" + j);
        return this;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a().a(SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED, str).c();
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : a().b().getString(SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED, "");
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            a().a(SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME, j).c();
        }
    }

    public long b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{this, new Long(j)})).longValue() : a().b().getLong(SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME, j);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a().a(SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT, i).c();
        }
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : a().b().getInt(SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT, i);
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : a().b().getLong(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, 86400000L);
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : a().b().getInt(c.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, i);
    }
}
