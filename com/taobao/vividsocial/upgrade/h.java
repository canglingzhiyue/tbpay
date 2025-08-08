package com.taobao.vividsocial.upgrade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.ask.ASK_CONST;
import java.util.Map;
import java.util.Set;
import tb.bhc;
import tb.bhd;
import tb.kge;
import tb.ohh;
import tb.ohi;
import tb.rij;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMENT_DIALOG_TAG = "socialsdk_comment_dialog_fragment";
    public static final String COMMENT_DSL = "https://g.alicdn.com/taobao_interaction/comment_tnode/";
    public static final String CUSTOM_DSL = "tnodedsl";

    static {
        kge.a(707141959);
    }

    public static boolean a(Intent intent, com.taobao.android.nav.d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d54a33", new Object[]{intent, dVar})).booleanValue();
        }
        com.taobao.vividsocial.utils.h.a();
        a(intent, "http://h5.m.taobao.com/comment/comment_detail_new2.htm");
        b(intent, "3");
        try {
            str = dVar.a().getClass().getCanonicalName();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        if (intent.getData() != null) {
            Map<String, String> a2 = com.taobao.vividsocial.utils.j.a(intent.getData());
            if (!a2.containsKey(CUSTOM_DSL)) {
                com.taobao.android.layoutmanager.container.f.a(COMMENT_DSL, a2);
            }
        }
        com.taobao.vividsocial.utils.h.a("Page_commentNav", "nav", SSOIPCConstants.IPC_JUMP_URL, "Detail", "originContext", str, "originUri", intent.getDataString());
        return true;
    }

    public static boolean b(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a299f74", new Object[]{intent, dVar})).booleanValue();
        }
        com.taobao.vividsocial.utils.h.a();
        a(intent, "http://h5.m.taobao.com/comment/poplist_new2.htm");
        b(intent, "2");
        Context a2 = dVar.a();
        com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "originUri", intent.getDataString(), "context", a2.getClass().getName());
        return a(intent, a2);
    }

    public static boolean a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7efd347", new Object[]{intent, context})).booleanValue();
        }
        final Uri data = intent.getData();
        if (data != null) {
            Map<String, String> a2 = com.taobao.vividsocial.utils.j.a(intent.getData());
            if (!a2.containsKey(CUSTOM_DSL)) {
                com.taobao.android.layoutmanager.container.f.a(COMMENT_DSL, a2);
            }
            final String queryParameter = data.getQueryParameter("sessionId");
            Set<String> queryParameterNames = data.getQueryParameterNames();
            final boolean z = queryParameterNames.contains("animContainerOffset") && queryParameterNames.contains("animTop");
            if (rij.d() && "com.taobao.tao.welcome.Welcome".equals(context.getClass().getName())) {
                context = com.taobao.application.common.c.b();
            }
            if (context instanceof FragmentActivity) {
                final Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    final FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(COMMENT_DIALOG_TAG);
                    if (findFragmentByTag == null) {
                        com.alibaba.android.split.core.splitinstall.h.a(activity).a(com.alibaba.android.split.core.splitinstall.j.a().a(new com.alibaba.android.split.ui.a(activity)).a(true).a(bhd.a(activity, "com.taobao.vividsocial.dialog.CmtDialogFragment").a(new bhc.b<Fragment>() { // from class: com.taobao.vividsocial.upgrade.h.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.bhc.b
                            public void a(Fragment fragment, Bundle bundle) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("80cf6b4a", new Object[]{this, fragment, bundle});
                                } else if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                                    ohi.a(activity, "加载异常，请稍后再试");
                                    com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "error", "activity.isDestroyed");
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("bundleUrl", data.toString());
                                    fragment.setArguments(bundle2);
                                    if (!fragment.isAdded()) {
                                        supportFragmentManager.beginTransaction().add(fragment, h.COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                                        supportFragmentManager.executePendingTransactions();
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("openState", (Object) true);
                                    jSONObject.put("interacted", (Object) Boolean.valueOf(z));
                                    com.taobao.social.sdk.jsbridge.a.commentCallback(queryParameter, true, true, false, jSONObject);
                                }
                            }

                            @Override // tb.bhc.b
                            public void a(String str, Bundle bundle) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                                    return;
                                }
                                ohi.a(activity, "加载失败，请稍后再试");
                                com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "error", str);
                            }
                        }).a()).a());
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("bundleUrl", data.toString());
                        findFragmentByTag.setArguments(bundle);
                        if (!findFragmentByTag.isAdded()) {
                            supportFragmentManager.beginTransaction().add(findFragmentByTag, COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                            supportFragmentManager.executePendingTransactions();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("openState", (Object) true);
                        jSONObject.put("interacted", (Object) Boolean.valueOf(z));
                        com.taobao.social.sdk.jsbridge.a.commentCallback(queryParameter, true, true, false, jSONObject);
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean b(Intent intent, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20b51e6", new Object[]{intent, context})).booleanValue();
        }
        com.taobao.vividsocial.utils.h.a();
        a(intent, "http://h5.m.taobao.com/comment/commentReply_new2.htm");
        b(intent, "4");
        com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "originUri", intent.getDataString(), "context", context.getClass().getName());
        if (rij.d() && "com.taobao.tao.welcome.Welcome".equals(context.getClass().getName())) {
            context = com.taobao.application.common.c.b();
        }
        final Uri data = intent.getData();
        if (data == null || !(context instanceof FragmentActivity)) {
            return true;
        }
        a(data);
        final Activity activity = (Activity) context;
        if (!activity.isFinishing()) {
            final FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(COMMENT_DIALOG_TAG);
            if (findFragmentByTag == null) {
                com.alibaba.android.split.core.splitinstall.h.a(activity).a(com.alibaba.android.split.core.splitinstall.j.a().a(new com.alibaba.android.split.ui.a(activity)).a(true).a(bhd.a(activity, "com.taobao.vividsocial.dialog.CmtReplyFragment").a(new bhc.b<Fragment>() { // from class: com.taobao.vividsocial.upgrade.h.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.bhc.b
                    public void a(Fragment fragment, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("80cf6b4a", new Object[]{this, fragment, bundle});
                        } else if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                            ohi.a(activity, "加载异常，请稍后再试");
                            com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "error", "activity.isDestroyed", "context", context.getClass().getName());
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("bundleUrl", data.toString());
                            fragment.setArguments(bundle2);
                            if (fragment.isAdded()) {
                                return;
                            }
                            supportFragmentManager.beginTransaction().add(fragment, h.COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                            supportFragmentManager.executePendingTransactions();
                        }
                    }

                    @Override // tb.bhc.b
                    public void a(String str, Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                            return;
                        }
                        ohi.a(activity, "加载失败，请稍后再试");
                        com.taobao.vividsocial.utils.h.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "error", str, "context", context.getClass().getName());
                    }
                }).a()).a());
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("bundleUrl", data.toString());
                findFragmentByTag.setArguments(bundle);
                if (!findFragmentByTag.isAdded()) {
                    supportFragmentManager.beginTransaction().add(findFragmentByTag, COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                    supportFragmentManager.executePendingTransactions();
                }
            }
        }
        return false;
    }

    private static void a(final Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{uri});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.vividsocial.upgrade.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, String> a2 = com.taobao.vividsocial.utils.j.a(uri);
                    if (a2.containsKey(h.CUSTOM_DSL)) {
                        return;
                    }
                    com.taobao.android.layoutmanager.container.f.a(h.COMMENT_DSL, a2);
                }
            });
        }
    }

    public static void a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289186af", new Object[]{intent, str});
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String encodedQuery = data.getEncodedQuery();
            if (!StringUtils.isEmpty(encodedQuery)) {
                str = str + "?" + encodedQuery;
            }
        }
        intent.setData(Uri.parse(str));
    }

    public static void b(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0bacf0", new Object[]{intent, str});
        } else if (intent != null && intent.getData() != null && !StringUtils.isEmpty(str)) {
            Uri.Builder buildUpon = intent.getData().buildUpon();
            buildUpon.appendQueryParameter(ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
            String valueOf = String.valueOf(ohh.b("comment_reUseEngine"));
            if (rij.a() && StringUtils.equals(valueOf, "true")) {
                buildUpon.appendQueryParameter("reUseEngine", "true");
            }
            Map<String, String> a2 = com.taobao.vividsocial.utils.j.a(intent.getData());
            if (!a2.containsKey("commentSourceType")) {
                buildUpon.appendQueryParameter("commentSourceType", str);
            }
            JSONObject a3 = rij.a(a2.get("namespace"));
            if (a3 != null) {
                for (Map.Entry<String, Object> entry : a3.entrySet()) {
                    String key = entry.getKey();
                    String valueOf2 = String.valueOf(entry.getValue());
                    if (a3.containsKey(key) && !a2.containsKey(key)) {
                        buildUpon.appendQueryParameter(key, valueOf2);
                    }
                }
            }
            intent.setData(buildUpon.build());
        }
    }
}
