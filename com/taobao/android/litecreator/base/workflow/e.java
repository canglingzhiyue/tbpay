package com.taobao.android.litecreator.base.workflow;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import tb.ios;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f13312a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;

    static {
        kge.a(-801865880);
        f13312a = "UGCWorkFlowHelper";
        b = "guangguang";
        c = "x_rate";
        e = "x_ask_everyone";
        d = "guangguang";
    }

    public static String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c73f2df4", new Object[]{aVar}) : a(aVar.get());
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!(context instanceof a)) {
            return null;
        }
        return a((a) context);
    }

    public static String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f8e93", new Object[]{aVar}) : b(aVar.get());
    }

    public static ios.a b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ios.a) ipChange.ipc$dispatch("df58525d", new Object[]{context}) : ios.a(c(context));
    }

    public static String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38ffef32", new Object[]{aVar}) : c(aVar.get());
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        if (!(context instanceof a)) {
            return null;
        }
        return c((a) context);
    }

    public static IUGCMedia d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUGCMedia) ipChange.ipc$dispatch("c49cf8b7", new Object[]{context});
        }
        if (!(context instanceof a)) {
            return null;
        }
        return ((a) context).get();
    }

    public static String a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99a65cfa", new Object[]{iUGCMedia});
        }
        String str = (iUGCMedia == null || iUGCMedia.getBiz() == null) ? "" : iUGCMedia.getBiz().bizLine;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String str2 = b;
        u.d(f13312a, "getBizLine is null, plz check: ");
        return str2;
    }

    public static String b(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4175619", new Object[]{iUGCMedia});
        }
        String str = (iUGCMedia == null || iUGCMedia.getBiz() == null) ? "" : iUGCMedia.getBiz().bizScene;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String str2 = b;
        u.d(f13312a, "getBizScene is null, plz check:!!! ");
        return str2;
    }

    public static String c(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce884f38", new Object[]{iUGCMedia});
        }
        if (iUGCMedia == null) {
            return null;
        }
        return iUGCMedia.getPublishSessionId();
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        EditorInfo f = f(context);
        if (f != null && f.resource != null) {
            return f.resource.type;
        }
        return null;
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{context});
        }
        EditorInfo p = p(context);
        if (p != null && p.resource != null) {
            return p.resource.type;
        }
        return null;
    }

    public static EditorInfo f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditorInfo) ipChange.ipc$dispatch("9663d495", new Object[]{context});
        }
        UGCVideo g = g(context);
        if (g != null && g.editorInfo != null) {
            return g.editorInfo;
        }
        return null;
    }

    public static EditorInfo p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditorInfo) ipChange.ipc$dispatch("6df2b94b", new Object[]{context});
        }
        UGCImage q = q(context);
        if (q != null && q.editorInfo != null) {
            return q.editorInfo;
        }
        return null;
    }

    public static UGCVideo g(Context context) {
        IUGCMedia iUGCMedia;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCVideo) ipChange.ipc$dispatch("65004256", new Object[]{context});
        }
        if ((context instanceof a) && (iUGCMedia = ((a) context).get()) != null && iUGCMedia.getVideos() != null && iUGCMedia.getVideos().size() > 0) {
            return iUGCMedia.getVideos().get(0);
        }
        return null;
    }

    public static UGCImage q(Context context) {
        IUGCMedia iUGCMedia;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("fa8a442c", new Object[]{context});
        }
        if ((context instanceof a) && (iUGCMedia = ((a) context).get()) != null && iUGCMedia.getImages() != null && iUGCMedia.getImages().size() > 0) {
            return iUGCMedia.getImages().get(0);
        }
        return null;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context}) : a(g(context));
    }

    public static String a(UGCVideo uGCVideo) {
        MediaStatInfo mediaStatInfo;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f008edbc", new Object[]{uGCVideo}) : (uGCVideo == null || (mediaStatInfo = (MediaStatInfo) uGCVideo.getMeta("mediaStatInfo")) == null) ? "unknown" : mediaStatInfo.source;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        EditorInfo f = f(context);
        return (f == null || f.resource == null || f.resource.type == null || (!StringUtils.equals(f.resource.type, Resource.TYPE_DEFAULT_MULTI) && !StringUtils.equals(f.resource.type, Resource.TYPE_RECORD_MULTI))) ? false : true;
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue() : a(e(context));
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return StringUtils.equals(str, "template") || StringUtils.equals(str, Resource.TYPE_TEMPLATE_TIMELINE) || StringUtils.equals(str, Resource.TYPE_TEMPLATE_ALBUM_AI_EDIT) || StringUtils.equals(str, Resource.TYPE_TEMPLATE_IN_MULTI);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return StringUtils.equals(str, Resource.TYPE_TEMPLATE_IMG);
        }
        return false;
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue() : context instanceof a;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a588c439", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof a)) {
            return false;
        }
        String b2 = b((a) context);
        if (StringUtils.equals(b2, c) || StringUtils.equals(b2, e) || StringUtils.equals(e(context), Resource.TYPE_TEMPLATE_LITE)) {
            return false;
        }
        ios.a b3 = b(context);
        if ((b3.a("disable_edit_quick_publish", false) || !s.u()) || b3.a(ios.KEY_XGC_APPEND_MODE, false) || m(context) || !b3.a("async_publish", true)) {
            return false;
        }
        u.d(f13312a, "isQuickPublishMode----------->");
        return true;
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6356fd8", new Object[]{context})).booleanValue();
        }
        UGCVideo g = g(context);
        if (g != null && (g.getMeta("media_is_reedit") instanceof Boolean)) {
            return ((Boolean) g.getMeta("media_is_reedit")).booleanValue();
        }
        return false;
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e21b77", new Object[]{context})).booleanValue();
        }
        IUGCMedia d2 = d(context);
        if (d2 != null && (d2.getMeta("onlyQuickPublishMode") instanceof Boolean)) {
            return ((Boolean) d2.getMeta("onlyQuickPublishMode")).booleanValue();
        }
        return false;
    }
}
