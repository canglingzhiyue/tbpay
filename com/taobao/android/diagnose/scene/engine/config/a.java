package com.taobao.android.diagnose.scene.engine.config;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.c;
import com.taobao.android.diagnose.common.d;
import com.taobao.android.diagnose.scene.engine.action.UploadTLogAction;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.fmu;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SceneRunningRecord f11720a;
    private static File b;
    private static long c;

    private static boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{new Long(j), new Long(j2)})).booleanValue() : j2 - j < 86400000;
    }

    static {
        kge.a(-863487271);
        c = 0L;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f11720a = null;
        b = new File(c.a().g(), "rules_record.json");
        e();
    }

    public static boolean a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        char c2 = 3;
        char c3 = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69987ee0", new Object[]{str, str2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        SceneRunningRecord sceneRunningRecord = f11720a;
        if (sceneRunningRecord == null) {
            return false;
        }
        if (i == 0) {
            TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute action: %s. MaxExecuteCount=0", str2));
            return false;
        }
        List<ActionsExecuteRecord> list = sceneRunningRecord.rulesRecordList.get(str);
        if (list != null && !list.isEmpty()) {
            for (ActionsExecuteRecord actionsExecuteRecord : list) {
                if (actionsExecuteRecord.actionID.equals(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (i > 0 && actionsExecuteRecord.executeCount >= i && a(actionsExecuteRecord.firstExecuteTime, currentTimeMillis)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = str2;
                        objArr[1] = Integer.valueOf(i);
                        objArr[c3] = Integer.valueOf(actionsExecuteRecord.executeCount);
                        objArr[c2] = Long.valueOf(actionsExecuteRecord.firstExecuteTime);
                        TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute action: %s. MaxExecuteCount=%d, ExecuteCount=%d， FirstExecuteTime=%d", objArr));
                        return false;
                    }
                    long j = i2 * 60000;
                    if (currentTimeMillis - actionsExecuteRecord.lastExecuteTime < j) {
                        TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute action: %s. curTime=%d, lastExecuteTime=%d， executeInterval=%d", str2, Long.valueOf(currentTimeMillis), Long.valueOf(actionsExecuteRecord.lastExecuteTime), Long.valueOf(j)));
                        return false;
                    }
                    c2 = 3;
                }
                c3 = 2;
            }
        }
        return true;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            List<ActionsExecuteRecord> list = f11720a.rulesRecordList.get(str);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ActionsExecuteRecord actionsExecuteRecord = new ActionsExecuteRecord();
                actionsExecuteRecord.ruleID = str;
                actionsExecuteRecord.actionID = str2;
                actionsExecuteRecord.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord.lastExecuteTime = currentTimeMillis;
                actionsExecuteRecord.executeCount = 1;
                arrayList.add(actionsExecuteRecord);
                f11720a.rulesRecordList.put(str, arrayList);
                return;
            }
            ActionsExecuteRecord actionsExecuteRecord2 = null;
            for (ActionsExecuteRecord actionsExecuteRecord3 : list) {
                if (actionsExecuteRecord3.ruleID.equals(str)) {
                    actionsExecuteRecord2 = actionsExecuteRecord3;
                }
            }
            if (actionsExecuteRecord2 == null) {
                ActionsExecuteRecord actionsExecuteRecord4 = new ActionsExecuteRecord();
                actionsExecuteRecord4.ruleID = str;
                actionsExecuteRecord4.actionID = str2;
                actionsExecuteRecord4.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord4.lastExecuteTime = currentTimeMillis;
                actionsExecuteRecord4.executeCount = 1;
                list.add(actionsExecuteRecord4);
                return;
            }
            if (a(actionsExecuteRecord2.firstExecuteTime, currentTimeMillis)) {
                actionsExecuteRecord2.executeCount++;
            } else {
                actionsExecuteRecord2.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord2.executeCount = 1;
            }
            actionsExecuteRecord2.lastExecuteTime = currentTimeMillis;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        SceneRunningRecord sceneRunningRecord = f11720a;
        if (sceneRunningRecord == null || sceneRunningRecord.rulesRecordList == null || f11720a.rulesRecordList.remove(str) == null) {
            return;
        }
        v.a("SceneRunningManager", "Remove rule running data: " + str);
        d();
    }

    public static boolean a(Context context, String str, fmu fmuVar, UploadTLogAction.TLogActionConfig tLogActionConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf375ea1", new Object[]{context, str, fmuVar, tLogActionConfig})).booleanValue();
        }
        TLogUploadActionConfig j = com.taobao.android.diagnose.config.a.j();
        long currentTimeMillis = System.currentTimeMillis();
        if (tLogActionConfig.needWifi && c.a().d().e().getType() != 7) {
            TLog.loge("SceneUpload", "SceneRunningManager", "Can't upload tlog! Not in wifi!!");
            return false;
        } else if (currentTimeMillis - f11720a.tlogUploadLastTime <= j.uploadInterval * 1000) {
            TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute tlog upload! tlogUploadLastTime=%d, curTime=%d， uploadInterval=%d", Long.valueOf(f11720a.tlogUploadLastTime), Long.valueOf(currentTimeMillis), Integer.valueOf(j.uploadInterval)));
            return false;
        } else if (j.maxLimit > 0 && f11720a.tlogUploadCount >= j.maxLimit && a(f11720a.tlogUploadFirstTime, currentTimeMillis)) {
            TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute tlog upload! MaxCount=%d, CurCount=%d， LimitTimeStart=%d", Integer.valueOf(j.maxLimit), Integer.valueOf(f11720a.tlogUploadCount), Long.valueOf(f11720a.tlogUploadFirstTime)));
            return false;
        } else {
            return a(str, fmuVar.c(), fmuVar.a(), tLogActionConfig.actionInterval);
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a(f11720a.tlogUploadFirstTime, currentTimeMillis)) {
            f11720a.tlogUploadCount++;
        } else {
            SceneRunningRecord sceneRunningRecord = f11720a;
            sceneRunningRecord.tlogUploadCount = 1;
            sceneRunningRecord.tlogUploadFirstTime = currentTimeMillis;
        }
        f11720a.tlogUploadLastTime = currentTimeMillis;
        a(str, str2);
        d();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f11720a == null) {
            return false;
        }
        return c <= 0 || System.currentTimeMillis() - f11720a.sceneLastUpdateTime > c * 60000;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        f11720a.sceneLastUpdateTime = System.currentTimeMillis();
        d();
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            d.a(b, JSON.toJSONString(f11720a));
        } catch (Exception e) {
            v.a("SceneRunningManager", "save: ", e);
        }
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        String a2 = d.a(b);
        if (!TextUtils.isEmpty(a2)) {
            try {
                f11720a = (SceneRunningRecord) JSON.parseObject(a2, SceneRunningRecord.class);
                return;
            } catch (Exception e) {
                v.a("SceneRunningManager", "load: ", e);
                b.delete();
                return;
            }
        }
        f11720a = new SceneRunningRecord();
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            c = j;
        }
    }
}
