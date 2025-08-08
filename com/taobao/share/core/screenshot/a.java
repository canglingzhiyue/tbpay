package com.taobao.share.core.screenshot;

import android.app.Activity;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.picturepassword.b;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import tb.esr;
import tb.kge;
import tb.nyk;
import tb.nyl;
import tb.nym;
import tb.nyo;
import tb.nys;
import tb.nyy;
import tb.oan;
import tb.obl;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19615a;
    private static final String b;
    private static final String g;
    private ContentObserver c;
    private Context d = null;
    private Handler e = new Handler();
    private String f = "";

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3c58204", new Object[]{aVar, str});
        }
        aVar.f = str;
        return str;
    }

    public static /* synthetic */ void a(a aVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390a0b0d", new Object[]{aVar, strArr});
        } else {
            aVar.a(strArr);
        }
    }

    public static /* synthetic */ boolean a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d47c7c36", new Object[]{aVar, new Long(j)})).booleanValue() : aVar.a(j);
    }

    public static /* synthetic */ boolean a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79ab48ea", new Object[]{aVar, str, str2})).booleanValue() : aVar.a(str, str2);
    }

    public static /* synthetic */ ShareContent b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareContent) ipChange.ipc$dispatch("e9ba3d11", new Object[]{aVar, str}) : aVar.a(str);
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : f19615a;
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : b;
    }

    static {
        kge.a(-1021168625);
        f19615a = b.b().toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        b = b.c().toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        g = com.alibaba.ability.localization.b.a(R.string.app_screenshot);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Log.e("ScreenObserverManager", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18297));
        this.d = nym.a();
        a(this.d);
        b();
    }

    private void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.c != null) {
        } else {
            this.c = new ContentObserver(this.e) { // from class: com.taobao.share.core.screenshot.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z, Uri uri) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                        return;
                    }
                    Activity activity = com.taobao.share.copy.a.a().e().get();
                    if (activity == null || !nyl.a(activity)) {
                        return;
                    }
                    TLog.loge("ScreenObserverManager", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18283));
                    a.a(a.this, obl.a());
                    Cursor cursor = null;
                    if (uri != null) {
                        try {
                            String uri2 = uri.toString();
                            if ((uri2.matches(a.e()) || uri2.matches(a.f())) && (cursor = context.getContentResolver().query(uri, null, null, null, "date_added DESC")) != null && cursor.moveToFirst()) {
                                final String string = cursor.getString(cursor.getColumnIndex("_display_name"));
                                final String a2 = b.a(context, cursor);
                                final long j = cursor.getLong(cursor.getColumnIndex("date_added"));
                                Coordinator.execute(new Runnable() { // from class: com.taobao.share.core.screenshot.a.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        boolean z2 = false;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            a.a(a.this, a2);
                                            if (!a.a(a.this, a2, string) || !a.a(a.this, j)) {
                                                return;
                                            }
                                            TLog.loge("ScreenObserverManager", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18279) + a2 + "===========" + string);
                                            ShareContent b2 = a.b(a.this, a2);
                                            Activity activity2 = com.taobao.share.copy.a.a().e().get();
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18289));
                                            sb.append(activity2 != null);
                                            sb.append("===========");
                                            sb.append(b2 != null);
                                            TLog.loge("ScreenObserverManager", sb.toString());
                                            if (activity2 == null || b2 == null) {
                                                return;
                                            }
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18288));
                                            sb2.append(activity2 != null);
                                            sb2.append("===========");
                                            if (b2 != null) {
                                                z2 = true;
                                            }
                                            sb2.append(z2);
                                            TLog.loge("ScreenObserverManager", sb2.toString());
                                            ShareBusiness.getInstance();
                                            ShareBusiness.share(activity2, b2);
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            try {
                                TLog.loge("ScreenObserverManager", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18275) + th.getMessage());
                                th.printStackTrace();
                                if (cursor == null) {
                                    return;
                                }
                                return;
                            } finally {
                                if (cursor != null) {
                                    cursor.close();
                                }
                            }
                        }
                    }
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                }
            };
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.d.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.c);
            this.d.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.c);
            TLog.loge("ScreenObserverManager", "register observer");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.d.getContentResolver().unregisterContentObserver(this.c);
            TLog.loge("ScreenObserverManager", "unregister observer");
        }
    }

    private void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        Activity c = ShareBizAdapter.getInstance().getAppEnv().c();
        if (c == null) {
            return;
        }
        try {
            if (a(this.d, strArr)) {
                return;
            }
            ActivityCompat.requestPermissions(c, strArr, esr.EVALUATION);
        } catch (Exception unused) {
        }
    }

    private boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{this, context, strArr})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && context != null && strArr != null) {
            for (String str : strArr) {
                if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : (StringUtils.isEmpty(str) || (!str.toLowerCase().contains("tencent") && !str.toLowerCase().contains("qq") && !str.toLowerCase().contains(nyk.KEY_SHARE_CONFIG_WEIXIN) && !str.toLowerCase().contains("wechat"))) && str != null && str2 != null && (str2.toLowerCase().contains("screenshot") || str.toLowerCase().contains("screenshot") || str2.toLowerCase().contains(g) || str.toLowerCase().contains(g));
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis - j < 0) {
                j /= 1000;
            }
            String str = "fileAddTime = " + j + ";currentTime = " + currentTimeMillis;
            long j2 = currentTimeMillis - j;
            if (j2 <= 5) {
                return true;
            }
            TLog.loge("ScreenObserverManager", "isInValidTimeInterval VALID_TIME_INTERVAL" + j2);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private ShareContent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("3178c39c", new Object[]{this, str});
        }
        String d = d();
        if (StringUtils.isEmpty(d)) {
            return null;
        }
        ShareContent shareContent = new ShareContent();
        ALDetailAffectionBean aLDetailAffectionBean = (ALDetailAffectionBean) JSON.parseObject(d, ALDetailAffectionBean.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", aLDetailAffectionBean.title);
        hashMap.put("shop", aLDetailAffectionBean.shop);
        hashMap.put("price", aLDetailAffectionBean.price);
        hashMap.put("pic", aLDetailAffectionBean.pic);
        hashMap.put("itemid", aLDetailAffectionBean.itemid);
        hashMap.put("url", aLDetailAffectionBean.url);
        shareContent.businessId = nyk.KEY_SHARE_SCREENSHOT_BIZ_ID;
        shareContent.templateId = "detail";
        shareContent.description = aLDetailAffectionBean.title;
        HashMap hashMap2 = new HashMap();
        String[] strArr = {aLDetailAffectionBean.pic};
        hashMap2.put("price", aLDetailAffectionBean.price);
        hashMap2.put("title", aLDetailAffectionBean.title);
        hashMap2.put("images", strArr);
        hashMap2.put("screenshot", str);
        shareContent.extendParams = hashMap;
        shareContent.templateParams = hashMap2;
        shareContent.imageUrl = this.f;
        shareContent.url = aLDetailAffectionBean.url;
        shareContent.title = aLDetailAffectionBean.title;
        shareContent.contentType = "";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        return shareContent;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String string = nym.a().getSharedPreferences("TB_Detail", 0).getString(nyo.SP_KEY_AFFECTION_DETAIL, "");
        String str = "getItemDetailShareContent： " + string;
        if (!StringUtils.isEmpty(string)) {
            nys.a("TB_Detail", string);
            return string;
        }
        String a2 = nys.a("TB_Detail");
        nyy.b("ScreenObserverManager", "getItemDetailShareContent： null fixIt: " + a2);
        return a2;
    }
}
