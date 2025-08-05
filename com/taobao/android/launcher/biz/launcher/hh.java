package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.guc;
import tb.gve;

/* loaded from: classes.dex */
public class hh extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f13050a = 0;
    private static int b = 1;
    private static int c = 2;
    private static volatile boolean d = false;
    private int e;

    public static /* synthetic */ Object ipc$super(hh hhVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hh(String str) {
        super(str);
        this.e = -1;
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        android.taobao.safemode.k c2 = android.taobao.safemode.h.a().c();
        if (c2 == null || this.e == -1) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        int i = this.e;
        if (i == f13050a || i == c) {
            hashMap2.put("startupUrl", c2.h);
            hashMap2.put("startIntent", c2.e.getDataString());
        } else if (i == b) {
            hashMap2.put("interceptLinkBack", true);
        }
        hashMap2.put("taskType", Integer.valueOf(this.e));
        d = true;
        PageRenderIntercept.init(application, hashMap2);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        android.taobao.safemode.k c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        if (!super.intercept(cVar) || (c2 = android.taobao.safemode.h.a().c()) == null) {
            return false;
        }
        Uri a2 = a(c2);
        if (a(a2) && a(a2, "cold_launch_tab2")) {
            this.e = f13050a;
            return true;
        } else if (b(a2) && a(a2, "cold_launch_video")) {
            this.e = c;
            return true;
        } else if (!d()) {
            return false;
        } else {
            this.e = b;
            return true;
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : LauncherRuntime.k == 1 || LauncherRuntime.k == 2;
    }

    private Uri a(android.taobao.safemode.k kVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("85620683", new Object[]{this, kVar});
        }
        if (kVar.e == null || (data = kVar.e.getData()) == null || data.isOpaque()) {
            return null;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter) || (parse = Uri.parse(queryParameter)) == null || parse.isOpaque()) {
            return null;
        }
        return parse;
    }

    private boolean a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1b95ed", new Object[]{this, uri, str})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        if (com.taobao.android.launcher.bootstrap.tao.ability.h.c(uri.toString()) != null) {
            return true;
        }
        return guc.a(LauncherRuntime.g, str);
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        String queryParameter = uri.getQueryParameter("tabid");
        String queryParameter2 = uri.getQueryParameter("skipOpt");
        TLog.loge(gve.MODULE, getId(), "path:" + path + " tabId:" + queryParameter + " skpOpt:" + queryParameter2);
        return (TextUtils.equals(path, "/guangguang/index.htm") || TextUtils.equals(path, "/tnode/index.htm")) && !TextUtils.equals(queryParameter2, "1");
    }

    private boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        String queryParameter = uri.getQueryParameter("skipOpt");
        TLog.loge(gve.MODULE, getId(), "path:" + path + " skpOpt:" + queryParameter);
        return TextUtils.equals(path, "/app/tb-source-app/video-fullpage/pages/index2") && !TextUtils.equals(queryParameter, "1");
    }

    public static boolean Q_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f88c7b9", new Object[0])).booleanValue() : d;
    }
}
