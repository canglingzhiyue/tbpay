package com.taobao.themis.kernel.extension.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Arrays;
import java.util.Locale;
import tb.kge;

/* loaded from: classes9.dex */
public interface u extends g {
    public static final a Companion = a.f22531a;
    public static final String META_KEY_SHARE_BIZ_ID = "WV.Meta.Share.BizId";
    public static final String META_KEY_SHARE_DISABLED = "WV.Meta.Share.Disabled";
    public static final String META_KEY_SHARE_IMAGE = "WV.Meta.Share.Image";
    public static final String META_KEY_SHARE_TARGETS = "WV.Meta.Share.Targets";
    public static final String META_KEY_SHARE_TEXT = "WV.Meta.Share.Text";
    public static final String META_KEY_SHARE_TITLE = "WV.Meta.Share.Title";
    public static final String META_KEY_SHARE_URL = "WV.Meta.Share.Url";

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(693027328);
        }

        public static void a(u uVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a8a84a3", new Object[]{uVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(uVar, page);
        }

        public static void b(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bed0d7", new Object[]{uVar});
            } else {
                g.a.a(uVar);
            }
        }

        public static void c(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08972b6", new Object[]{uVar});
            } else {
                g.a.c(uVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(JSONObject jSONObject);
    }

    void a(c cVar);

    void a(String str);

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String META_KEY_SHARE_BIZ_ID = "WV.Meta.Share.BizId";
        public static final String META_KEY_SHARE_DISABLED = "WV.Meta.Share.Disabled";
        public static final String META_KEY_SHARE_IMAGE = "WV.Meta.Share.Image";
        public static final String META_KEY_SHARE_TARGETS = "WV.Meta.Share.Targets";
        public static final String META_KEY_SHARE_TEXT = "WV.Meta.Share.Text";
        public static final String META_KEY_SHARE_TITLE = "WV.Meta.Share.Title";
        public static final String META_KEY_SHARE_URL = "WV.Meta.Share.Url";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f22531a;
        private static final String[] b;

        static {
            kge.a(1392616542);
            f22531a = new a();
            b = new String[]{"WV.Meta.Share.Title", "WV.Meta.Share.Url", "WV.Meta.Share.Image", "WV.Meta.Share.Text", "WV.Meta.Share.Disabled", "WV.Meta.Share.Targets", "WV.Meta.Share.BizId"};
        }

        private a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            int length = b.length;
            String str = "";
            String str2 = "(function(){var d=document,r={}";
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.INSTANCE;
                Locale locale = Locale.getDefault();
                Object[] objArr = {Integer.valueOf(i), b[i], Integer.valueOf(i), Integer.valueOf(i)};
                String format = String.format(locale, ",n%d='%s',e%d=d.getElementById(n%d)", Arrays.copyOf(objArr, objArr.length));
                kotlin.jvm.internal.q.b(format, "java.lang.String.format(locale, format, *args)");
                sb.append(format);
                str2 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                kotlin.jvm.internal.w wVar2 = kotlin.jvm.internal.w.INSTANCE;
                Locale locale2 = Locale.getDefault();
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
                String format2 = String.format(locale2, "if(e%d){r[n%d]=e%d.getAttribute('value')}", Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.q.b(format2, "java.lang.String.format(locale, format, *args)");
                sb2.append(format2);
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            kotlin.jvm.internal.w wVar3 = kotlin.jvm.internal.w.INSTANCE;
            Object[] objArr3 = {str};
            String format3 = String.format(";%sreturn JSON.stringify(r);})()", Arrays.copyOf(objArr3, objArr3.length));
            kotlin.jvm.internal.q.b(format3, "java.lang.String.format(format, *args)");
            sb3.append(format3);
            return sb3.toString();
        }
    }
}
