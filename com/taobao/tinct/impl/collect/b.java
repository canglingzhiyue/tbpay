package com.taobao.tinct.impl.collect;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.logger.EventLogger;
import com.taobao.tinct.ITinctOperater;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import tb.qro;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private File f22949a;
    private Context b;
    private Set<com.taobao.tinct.b> c;
    private f d;
    private c e;
    private ChangeRecord f;
    private boolean g;
    private boolean h;

    /* loaded from: classes.dex */
    public static class a {
        public static final b INSTANCE = new b();
    }

    /* renamed from: lambda$7P_vD07z-fSCFGVKZZYv3oiijrE */
    public static /* synthetic */ void m1537lambda$7P_vD07zfSCFGVKZZYv3oiijrE(b bVar) {
        bVar.h();
    }

    public static /* synthetic */ void lambda$RnWGed4r7lLb20nfW9nRWQKbiiA(b bVar, BaseChangeInfo baseChangeInfo) {
        bVar.b(baseChangeInfo);
    }

    public static /* synthetic */ void lambda$oN7IefeNLFA6oarXsjh5cIOQo8U(b bVar) {
        bVar.i();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5f7cb133", new Object[0]) : a.INSTANCE;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        c(context);
        f();
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (this.g) {
        } else {
            Log.e("ChangeDataManager", "loadChangeRecord");
            this.e = new c(context);
            this.f = this.e.a();
            this.g = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e == null || this.f == null) {
        } else {
            Log.e("ChangeDataManager", "loadPatchInfo");
            this.f.inlinePatchInfo = this.e.c();
            this.f.instantPatchInfo = this.e.b();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (OrangeChangeInfo orangeChangeInfo : this.f.orangeChangeMap.values()) {
            if (orangeChangeInfo.isGray()) {
                sb.append(orangeChangeInfo.getTinctTag());
                sb.append("^");
            }
        }
        if (this.f.instantPatchInfo != null) {
            sb.append(this.f.instantPatchInfo.getTinctTag());
            sb.append("^");
        }
        if (this.f.inlinePatchInfo != null) {
            sb.append(this.f.inlinePatchInfo.getTinctTag());
            sb.append("^");
        }
        for (CustomChangeInfo customChangeInfo : this.f.customInfo.values()) {
            if (customChangeInfo.getFullExpireTime() == -1) {
                sb.append(customChangeInfo.getTinctTag());
                sb.append("^");
            }
        }
        if (this.f.dynamicChangeInfo != null && this.f.dynamicChangeInfo.a()) {
            sb.append(this.f.dynamicChangeInfo.getTinctTag());
            sb.append("^");
        }
        if (sb.length() <= 0) {
            return;
        }
        String a2 = com.taobao.orange.util.c.a(String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        String sb2 = sb.deleteCharAt(sb.length() - 1).toString();
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo("snapshotID", a2);
        crashCaughtHeader.addHeaderInfo("tinctInfo", sb2);
        Log.e("ChangeDataManager", "setLaunchTinct " + sb.toString());
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("tinctInfo", "");
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.b = context;
        try {
            File filesDir = this.b.getFilesDir();
            this.f22949a = new File(filesDir, "orange_config/" + OConstant.ENV.valueOf(com.taobao.tinct.impl.config.a.k()).getDes());
            c(context);
            if (e.a() == null) {
                a(new com.taobao.tinct.impl.collect.a());
            }
            qro.a().a(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$b$oN7IefeNLFA6oarXsjh5cIOQo8U
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$oN7IefeNLFA6oarXsjh5cIOQo8U(b.this);
                }
            });
            d.a(context, this);
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("tinct", "ChangeDataManager", "init failed: " + e.getMessage());
        }
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            e.a(this.f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.h = true;
        qro.a().a(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$b$7P_vD07z-fSCFGVKZZYv3oiijrE
            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.m1537lambda$7P_vD07zfSCFGVKZZYv3oiijrE(b.this);
            }
        });
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.d.a();
        g();
    }

    private b() {
        this.f = new ChangeRecord();
        this.d = new f();
        this.e = null;
        this.c = null;
        this.g = false;
    }

    public synchronized void a(com.taobao.tinct.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc79048d", new Object[]{this, bVar});
            return;
        }
        if (this.c == null) {
            this.c = Collections.synchronizedSet(new HashSet());
        }
        this.c.add(bVar);
    }

    public synchronized void a(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335aaef", new Object[]{this, orangeChangeInfo});
        } else if (orangeChangeInfo == null) {
        } else {
            try {
                String nameSpace = orangeChangeInfo.getNameSpace();
                if (this.f.orangeChangeMap.containsKey(nameSpace)) {
                    OrangeChangeInfo orangeChangeInfo2 = this.f.orangeChangeMap.get(nameSpace);
                    if (!orangeChangeInfo2.getVersion().equals(orangeChangeInfo.getVersion())) {
                        orangeChangeInfo.setStatus(1);
                        this.f.orangeChangeMap.put(nameSpace, orangeChangeInfo);
                        EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).setData("oldVer", orangeChangeInfo2.getVersion()).log();
                    } else if (orangeChangeInfo2.update(orangeChangeInfo)) {
                        orangeChangeInfo.setStatus(1);
                        orangeChangeInfo.setUsed(orangeChangeInfo2.isUsed());
                        EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).log();
                    } else {
                        String str = "The orange have not changed: " + orangeChangeInfo.getNameSpace();
                        return;
                    }
                } else {
                    if (orangeChangeInfo.isGray()) {
                        orangeChangeInfo.setStatus(1);
                    } else if (!new File(this.f22949a, orangeChangeInfo.getNameSpace()).exists()) {
                        String.format("Orange file not exist!! Init Orange Config %s, ver=%s", orangeChangeInfo.getNameSpace(), orangeChangeInfo.getVersion());
                        return;
                    } else {
                        orangeChangeInfo.setStatus(1);
                    }
                    this.f.orangeChangeMap.put(nameSpace, orangeChangeInfo);
                    EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).log();
                }
                e.a(orangeChangeInfo, "change");
                this.e.a(this.f);
                a((BaseChangeInfo) orangeChangeInfo);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("ChangeDataManager", "Exception onOrangeChanged:  " + e.getMessage());
            }
        }
    }

    public void a(InstantPatchChangeInfo instantPatchChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38393496", new Object[]{this, instantPatchChangeInfo});
            return;
        }
        try {
            synchronized (this) {
                this.f.instantPatchInfo = instantPatchChangeInfo;
            }
            EventLogger.builder(6).setData("type", instantPatchChangeInfo.getChangeType().toString()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, instantPatchChangeInfo.getVersion()).log();
            a((BaseChangeInfo) instantPatchChangeInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("ChangeDataManager", "Exception onPatchChanged:  " + e.getMessage());
        }
    }

    public void a(com.taobao.tinct.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf50273", new Object[]{this, bVar});
            return;
        }
        try {
            synchronized (this) {
                this.f.inlinePatchInfo = bVar;
            }
            EventLogger.builder(6).setData("type", bVar.getChangeType().toString()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, bVar.getVersion()).log();
            a((BaseChangeInfo) bVar);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("ChangeDataManager", "Exception onPatchChanged:  " + e.getMessage());
        }
    }

    public synchronized boolean a(ABChangeInfo aBChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99598580", new Object[]{this, aBChangeInfo})).booleanValue();
        } else if (aBChangeInfo == null) {
            return false;
        } else {
            try {
                int hashCode = aBChangeInfo.hashCode();
                if (this.f.abInfoMap.containsKey(Integer.valueOf(hashCode))) {
                    if (!aBChangeInfo.getPublishId().equals(this.f.abInfoMap.get(Integer.valueOf(hashCode)).getPublishId())) {
                        this.f.abInfoMap.put(Integer.valueOf(hashCode), aBChangeInfo);
                        EventLogger.builder(6).setData("type", aBChangeInfo.getChangeType().toString()).setData("eid", aBChangeInfo.getExperimentId()).setData("bid", aBChangeInfo.getBucketId()).setData(MspDBHelper.BizEntry.COLUMN_NAME_PID, aBChangeInfo.getPublishId()).log();
                    } else {
                        String.format("Activate Same ABTest %s-%s-%s:", aBChangeInfo.getExperimentId(), aBChangeInfo.getBucketId(), aBChangeInfo.getPublishId());
                        return false;
                    }
                } else {
                    this.f.abInfoMap.put(Integer.valueOf(hashCode), aBChangeInfo);
                    EventLogger.builder(6).setData("type", aBChangeInfo.getChangeType().toString()).setData("eid", aBChangeInfo.getExperimentId()).setData("bid", aBChangeInfo.getBucketId()).setData(MspDBHelper.BizEntry.COLUMN_NAME_PID, aBChangeInfo.getPublishId()).log();
                }
                a((BaseChangeInfo) aBChangeInfo);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("ChangeDataManager", "Exception onABChanged:  " + e.getMessage());
                return false;
            }
        }
    }

    public synchronized boolean a(com.taobao.tinct.model.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbf576d6", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.a())) {
            List<com.taobao.tinct.model.c> list = this.f.touchStoneInfo.get(cVar.getBizName());
            if (list != null) {
                if (list.contains(cVar)) {
                    return false;
                }
                list.add(cVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cVar);
                this.f.touchStoneInfo.put(cVar.getBizName(), arrayList);
            }
            EventLogger.builder(6).setData("type", ChangeType.TOUCH_STONE.toString()).setData("biz", cVar.getBizName()).setData("bucket", cVar.a()).log();
            a((BaseChangeInfo) cVar);
            return true;
        }
        return false;
    }

    public synchronized boolean a(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80152a90", new Object[]{this, customChangeInfo})).booleanValue();
        }
        CustomChangeInfo customChangeInfo2 = this.f.customInfo.get(customChangeInfo.getHashKey());
        if (customChangeInfo2 != null) {
            if (customChangeInfo.isFull()) {
                if (customChangeInfo2.getFullExpireTime() != -1 && TextUtils.equals(customChangeInfo2.getVersion(), customChangeInfo.getVersion())) {
                    String.format("[Not Change] Receive full custom tinct %s have not changed!", customChangeInfo.getTinctTag());
                    return false;
                }
                String.format("[Change] Receive full custom tinct from %s to %s full, updateFullExpireTime.", customChangeInfo2.getTinctTag(), customChangeInfo.getTinctTag());
                customChangeInfo.updateFullExpireTime();
                b(customChangeInfo);
                return false;
            } else if (customChangeInfo2.getFullExpireTime() == -1 && TextUtils.equals(customChangeInfo2.getVersion(), customChangeInfo.getVersion())) {
                String.format("[Not Change] Receive gray custom tinct %s have not changed!", customChangeInfo.getTinctTag());
                if (!customChangeInfo2.isStatistics() || com.taobao.tinct.impl.config.a.g(customChangeInfo) == 1) {
                    e.a(customChangeInfo2, "change");
                }
                return false;
            } else {
                EventLogger.builder(6).setData("type", customChangeInfo.getCustomType()).setData("config", customChangeInfo.getConfigType()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, customChangeInfo.getVersion()).setData("isGray", String.valueOf(customChangeInfo.isGray())).setData("oldVer", customChangeInfo2.getVersion()).log();
                String.format("[Change] Receive custom tinct %s change from %s to %s", customChangeInfo.getHashKey(), customChangeInfo2.getVersion(), customChangeInfo.getVersion());
            }
        } else {
            EventLogger.builder(6).setData("type", customChangeInfo.getCustomType()).setData("config", customChangeInfo.getConfigType()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, customChangeInfo.getVersion()).setData("isGray", String.valueOf(customChangeInfo.isGray())).log();
            if (customChangeInfo.isFull()) {
                String.format("[New] Receive full custom tinct %s, updateFullExpireTime and save it!", customChangeInfo.getTinctTag());
                customChangeInfo.updateFullExpireTime();
                b(customChangeInfo);
                return false;
            }
            String.format("[New] Receive gray custom tinct %s, will save it!", customChangeInfo.getTinctTag());
        }
        b(customChangeInfo);
        return true;
    }

    private void b(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398cb82b", new Object[]{this, customChangeInfo});
            return;
        }
        this.f.customInfo.put(customChangeInfo.getHashKey(), customChangeInfo);
        this.e.a(this.f);
        a((BaseChangeInfo) customChangeInfo);
    }

    public OrangeChangeInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("e104c579", new Object[]{this, str});
        }
        if (this.f.orangeChangeMap != null && !this.f.orangeChangeMap.isEmpty()) {
            return this.f.orangeChangeMap.get(str);
        }
        return null;
    }

    private void a(final BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316ecbec", new Object[]{this, baseChangeInfo});
            return;
        }
        Set<com.taobao.tinct.b> set = this.c;
        if (set == null || set.isEmpty()) {
            return;
        }
        qro.a().a(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$b$RnWGed4r7lLb20nfW9nRWQKbiiA
            @Override // java.lang.Runnable
            public final void run() {
                b.lambda$RnWGed4r7lLb20nfW9nRWQKbiiA(b.this, baseChangeInfo);
            }
        });
    }

    public /* synthetic */ void b(BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45b354b", new Object[]{this, baseChangeInfo});
            return;
        }
        for (com.taobao.tinct.b bVar : this.c) {
            if (bVar != null) {
                try {
                    bVar.a(baseChangeInfo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ChangeRecord d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeRecord) ipChange.ipc$dispatch("85d0385d", new Object[]{this}) : this.f;
    }

    public ITinctOperater e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITinctOperater) ipChange.ipc$dispatch("1fe7c856", new Object[]{this}) : this.d;
    }

    public static void a(com.taobao.tinct.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc78902e", new Object[]{aVar});
        } else {
            e.a(aVar);
        }
    }
}
