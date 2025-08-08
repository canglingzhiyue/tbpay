package com.alibaba.security.ccrc.manager;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.C1209fa;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.T;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.wukong.AlgoResultReporter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class CcrcContextImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CcrcContextImpl";
    public String mAppKey;
    public String mAppName;
    public String mAppVersion;
    public Context mContext;
    public final AtomicBoolean mInited;
    public String mTtid;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final CcrcContextImpl f3225a = new CcrcContextImpl();
    }

    private boolean doInit(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72980dc8", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        if (!this.mInited.compareAndSet(false, true)) {
            return true;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.mContext = context;
        this.mTtid = str;
        Kb.b().a(this.mContext);
        b.a(this.mContext);
        T.a().a(this.mContext, str);
        TrackManager.init(this.mContext);
        AlgoResultReporter.a.f3622a.init(this.mContext);
        if (z) {
            T.a().b();
        }
        C1209fa.a();
        return true;
    }

    private String getAppKeyFromSecurityGuard(Context context) {
        IStaticDataStoreComponent staticDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f17d7406", new Object[]{this, context});
        }
        SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
        return (securityGuardManager == null || (staticDataStoreComp = securityGuardManager.getStaticDataStoreComp()) == null) ? "" : staticDataStoreComp.getAppKeyByIndex(0);
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : a.f3225a.mContext;
    }

    public static CcrcContextImpl getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CcrcContextImpl) ipChange.ipc$dispatch("a76fb7", new Object[0]) : a.f3225a;
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.mAppKey)) {
            this.mAppKey = getAppKeyFromSecurityGuard(this.mContext);
        }
        return this.mAppKey;
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.mAppName)) {
            this.mAppName = C1238p.b(this.mContext);
        }
        return this.mAppName;
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.mAppVersion)) {
            this.mAppVersion = C1238p.a(this.mContext);
        }
        return this.mAppVersion;
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : this.mTtid;
    }

    public boolean init(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7aec9d", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return doInit(context, str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.mAppKey = str;
        }
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.mAppName = str;
        }
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.mAppVersion = str;
        }
    }

    public CcrcContextImpl() {
        this.mInited = new AtomicBoolean(false);
    }
}
