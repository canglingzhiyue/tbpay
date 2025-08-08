package com.taobao.android.weex_uikit.widget.a;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-687911013);
    }

    public static /* synthetic */ void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{uINode});
        } else {
            b(uINode);
        }
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(Constants.Name.HREF, str);
        }
    }

    public static void a(final UINode uINode, Object obj, String str, View.OnClickListener onClickListener, m<View.OnClickListener> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a74d06", new Object[]{uINode, obj, str, onClickListener, mVar});
        } else if (StringUtils.isEmpty(str)) {
            if (onClickListener != null) {
                uINode.removeClickListener(onClickListener);
            }
            mVar.a(null);
        } else {
            mVar.a(new View.OnClickListener() { // from class: com.taobao.android.weex_uikit.widget.a.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        b.a(UINode.this);
                    }
                }
            });
            uINode.addOnClickListener(mVar.b());
        }
    }

    public static void a(final UINode uINode, MUSDKInstance mUSDKInstance, Object obj, m<View.OnClickListener> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8fe6c5", new Object[]{uINode, mUSDKInstance, obj, mVar});
        } else if (StringUtils.isEmpty((String) uINode.getAttribute(Constants.Name.HREF))) {
        } else {
            mVar.a(new View.OnClickListener() { // from class: com.taobao.android.weex_uikit.widget.a.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        b.a(UINode.this);
                    }
                }
            });
            uINode.addOnClickListener(mVar.b());
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, Object obj, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8103c7", new Object[]{uINode, mUSDKInstance, obj, onClickListener});
        } else if (onClickListener == null) {
        } else {
            uINode.removeClickListener(onClickListener);
        }
    }

    private static void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134606bf", new Object[]{uINode});
            return;
        }
        String str = (String) uINode.getAttribute(Constants.Name.HREF);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (StringUtils.isEmpty(scheme) || "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            b(uINode, str);
            return;
        }
        try {
            uINode.getInstance().getUIContext().startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (Throwable th) {
            com.taobao.android.weex_framework.monitor.b.a();
            g.c("A", th);
        }
    }

    private static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        String jSONString = jSONObject.toJSONString();
        MUSDKInstance uINode2 = uINode.getInstance();
        if (uINode2.getActivityNav() != null && uINode2.getActivityNav().a(uINode.getInstance().getUIContext(), uINode.getInstance(), jSONString)) {
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            Uri.Builder buildUpon = parse.buildUpon();
            if (StringUtils.isEmpty(scheme)) {
                buildUpon.scheme("http");
            }
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.addCategory("com.taobao.android.intent.category.MUS");
            intent.putExtra("instanceId", uINode2.getInstanceId());
            uINode2.getUIContext().startActivity(intent);
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            g.c("A", e);
        }
    }
}
