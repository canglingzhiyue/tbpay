package com.taobao.share.globalmodel;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.ado;
import tb.kge;
import tb.obc;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GENPASSWORD = "mtop.taobao.sharepassword.genpassword";
    public static final String GETBIZCONFIG = "mtop.taobao.sharepassword.getNewBizConfig";
    public static final String NAV_URL_DETAIL_BASE = "https://a.m.taobao.com/i";
    public static final String QUERYPASSEORD = "mtop.taobao.sharepassword.querypassword";
    private static e h;
    private TBShareContent b;
    private WeakReference<Activity> c;
    private String d;
    private f e;
    private String g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19631a = false;
    private boolean f = false;
    private boolean i = false;
    private Map<String, String> j = new HashMap();

    static {
        kge.a(-649858163);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public static e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("cf4d48e3", new Object[0]);
        }
        if (h == null) {
            h = new e();
        }
        return h;
    }

    private e() {
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        TBShareContent tBShareContent = this.b;
        return tBShareContent != null ? tBShareContent.shareScene : "";
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            this.b = new TBShareContent();
        }
        this.b.shareScene = str;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this});
        }
        Activity activity = null;
        WeakReference<Activity> weakReference = this.c;
        if (weakReference != null) {
            activity = weakReference.get();
        }
        return activity != null ? activity : ShareBizAdapter.getInstance().getAppEnv().b();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public f g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("148962dd", new Object[]{this}) : this.e;
    }

    public View h() {
        Activity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.c;
        if (weakReference != null) {
            c = weakReference.get();
        } else {
            c = ShareBizAdapter.getInstance().getAppEnv().c();
        }
        if (c == null) {
            TLog.logi("TBShareContentContainer", "getParent activity is null");
            return null;
        }
        return c.getWindow().getDecorView();
    }

    public WeakReference<Activity> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("875c8d3e", new Object[]{this}) : this.c;
    }

    public TBShareContent j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBShareContent) ipChange.ipc$dispatch("1908b4ce", new Object[]{this}) : this.b;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if (this.b.extraParams == null) {
                this.b.extraParams = new HashMap();
            }
            this.b.extraParams.put(str, str2);
        }
    }

    public void a(WeakReference<Activity> weakReference, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8d52f7", new Object[]{this, weakReference, tBShareContent});
            return;
        }
        this.b = null;
        this.c = weakReference;
        this.f19631a = false;
        this.d = null;
        this.e = null;
        a(tBShareContent);
        n();
        l();
    }

    private void n() {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TBShareContent tBShareContent = this.b;
        if (tBShareContent == null || TextUtils.isEmpty(tBShareContent.url) || !TextUtils.equals("item", this.b.shareScene)) {
            return;
        }
        if (this.b.url.startsWith(NAV_URL_DETAIL_BASE)) {
            this.d = this.b.url.substring(24, this.b.url.indexOf(".htm"));
        }
        if (TextUtils.isEmpty(this.d)) {
            try {
                this.d = this.b.url.substring(this.b.url.indexOf("/i") + 2, this.b.url.indexOf(".htm"));
            } catch (Exception e) {
                TLog.loge("taobao_contacts", e.getMessage());
            }
        }
        if (TextUtils.isEmpty(this.d) && (a2 = obc.a(this.b.url)) != null && a2.size() > 0) {
            this.d = a2.get("id");
        }
        if (!TextUtils.isEmpty(this.d)) {
            return;
        }
        this.b.shareScene = "other";
    }

    private void a(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent});
            return;
        }
        this.b = tBShareContent;
        this.b.setDefault();
        if (TextUtils.isEmpty(tBShareContent.businessId)) {
            TLog.logw("TBShareContentContainer", "警告：BusinessId 为空，无法完成数据统计和对应业务的管理，请务必传入！");
        }
        if (!TextUtils.isEmpty(this.b.weixinAppId)) {
            this.f19631a = true;
        }
        o();
    }

    private void o() {
        Uri.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.b.imageUrl) && !this.b.imageUrl.startsWith("http") && this.b.imageUrl.startsWith(ado.URL_SEPARATOR)) {
            this.b.imageUrl = "http:" + this.b.imageUrl;
        }
        if (!TextUtils.isEmpty(this.b.url) && !this.b.url.startsWith("http")) {
            this.b.url = "http:" + this.b.url;
        }
        if (TextUtils.isEmpty(this.b.url)) {
            return;
        }
        this.b.suId = ShareBusiness.getInstance().generateShareId();
        String str = null;
        try {
            Uri parse = Uri.parse(this.b.url);
            builder = parse.buildUpon().clearQuery();
            try {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        if ("detailSharePosition".equals(str2)) {
                            this.b.detailSharePosition = parse.getQueryParameter(str2);
                        }
                        if (!"ut_sk".equals(str2)) {
                            try {
                                builder.appendQueryParameter(str2, parse.getQueryParameter(str2));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                builder.appendQueryParameter("sourceType", this.b.shareScene);
                builder.appendQueryParameter("suid", this.b.suId);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            builder = null;
        }
        if (!ShareBizAdapter.getInstance().getLogin().b()) {
            return;
        }
        if (this.b.activityParams != null && this.b.activityParams.size() > 0) {
            if (this.b.activityParams.get("activityId") != null) {
                str = this.b.activityParams.get("activityId").toString();
            }
            if (!TextUtils.isEmpty(str)) {
                TBShareContent tBShareContent = this.b;
                tBShareContent.businessId = str;
                tBShareContent.isActivity = "true";
            }
        }
        if ("true".equals(this.b.needSaveContent) || "true".equals(this.b.isActivity)) {
            this.b.shareId = ShareBusiness.getInstance().generateShareId();
            if (builder != null) {
                builder.appendQueryParameter("shareid", this.b.shareId);
            }
        }
        if (builder != null) {
            this.b.url = builder.build().toString();
            return;
        }
        TLog.loge("TBShareContentContainer", "url 处理失败,原始URL：" + this.b.url);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.g;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            this.j.put(str, str2);
            TBShareContent tBShareContent = this.b;
            if (tBShareContent == null) {
                return;
            }
            tBShareContent.serverDataTrackMap = JSON.toJSONString(this.j);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.j.clear();
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        return "serverDataTrackMap=" + JSON.toJSONString(this.j);
    }
}
