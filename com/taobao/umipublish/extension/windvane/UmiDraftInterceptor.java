package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.d;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.gateway.util.i;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.draft.b;
import com.taobao.umipublish.widget.b;
import java.util.Map;
import tb.ior;
import tb.ios;
import tb.kge;
import tb.tek;

/* loaded from: classes9.dex */
public class UmiDraftInterceptor implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long b;

    /* renamed from: a  reason: collision with root package name */
    private final long f23279a = 1000;

    @Override // com.taobao.android.litecreator.sdk.nav.a
    public void nav(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7d1fc1", new Object[]{this, intent, context});
        }
    }

    public static /* synthetic */ void a(UmiDraftInterceptor umiDraftInterceptor, Context context, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e913eaa", new Object[]{umiDraftInterceptor, context, draftModel});
        } else {
            umiDraftInterceptor.a(context, draftModel);
        }
    }

    private String a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c6f18d", new Object[]{this, uri, str, str2});
        }
        String queryParameter = uri.getQueryParameter(ior.f29193a);
        if (!StringUtils.isEmpty(queryParameter)) {
            return ios.a(queryParameter).a(str, str2);
        }
        return uri.getQueryParameter(str);
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
        }
        for (String str : new String[]{UmiWvPlugin.NEW_RECORD_PATH, UmiWvPlugin.NEW_RECORD_PATH_DIRECT}) {
            if (ax.b(uri, Uri.parse(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.litecreator.sdk.nav.a
    public boolean intercept(Intent intent, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debaad86", new Object[]{this, intent, context})).booleanValue();
        }
        if (!tek.i() && intent != null && intent.getData() != null && context != null) {
            final Uri data = intent.getData();
            if (!a(data)) {
                return false;
            }
            String a2 = a(data, "biz_scene", "guangguang");
            String a3 = a(data, ios.KEY_IS_USE_NEW_PUBLISHER, "0");
            if (!"guangguang".equals(a2) || StringUtils.isEmpty(b.a(context).a("guangguang"))) {
                return false;
            }
            final DraftModel d = b.a(context).d("guangguang");
            String a4 = a(d);
            if (StringUtils.isEmpty(a4)) {
                a4 = "https://img.alicdn.com/imgextra/i4/O1CN01guxPeP1frz78rRGU6_!!6000000004061-2-tps-420-420.png";
            }
            if (d != null && !StringUtils.isEmpty(d.draftId)) {
                if (d.urlParams != null && d.urlParams.containsKey(ios.KEY_IS_USE_NEW_PUBLISHER) && !StringUtils.equals(d.urlParams.get(ios.KEY_IS_USE_NEW_PUBLISHER), a3)) {
                    u.d(b.TAG, "user = " + a3 + ", last draft = " + d.urlParams.get(ios.KEY_IS_USE_NEW_PUBLISHER));
                    return false;
                }
                final com.taobao.umipublish.widget.b bVar = new com.taobao.umipublish.widget.b(context, R.style.LCCustomDialog);
                bVar.b(a4);
                bVar.a(com.alibaba.ability.localization.b.a(R.string.gg_pub_incomplete_work_continue));
                bVar.a(com.alibaba.ability.localization.b.a(R.string.gg_pub_continue), new b.InterfaceC1004b() { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.umipublish.widget.b.InterfaceC1004b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        bVar.dismiss();
                        com.taobao.umipublish.draft.b.a(context).b(r4);
                        UmiDraftInterceptor.a(UmiDraftInterceptor.this, context, d);
                    }
                });
                bVar.a(com.alibaba.ability.localization.b.a(R.string.gg_pub_cancel), new b.a() { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.umipublish.widget.b.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        bVar.dismiss();
                        com.taobao.umipublish.draft.b.a(context).b(r4);
                        Nav.from(context).toUri(data);
                    }
                });
                if (!a()) {
                    bVar.show();
                }
                return true;
            }
        }
        return false;
    }

    private String a(DraftModel draftModel) {
        DraftModel.Video video;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("972eeb7d", new Object[]{this, draftModel});
        }
        if (draftModel != null && draftModel.meta != null && !StringUtils.isEmpty(draftModel.meta.type)) {
            if (i.SOURCE_TYPE_PHOTO.equals(draftModel.meta.type) && draftModel.meta.photos != null && draftModel.meta.photos.size() > 0) {
                DraftModel.Photo photo = draftModel.meta.photos.get(0);
                if (photo != null) {
                    return photo.localUrl;
                }
            } else if ("video".equals(draftModel.meta.type) && draftModel.meta.videos != null && draftModel.meta.videos.size() > 0 && (video = draftModel.meta.videos.get(0)) != null) {
                return video.coverLocalUrl;
            }
        }
        return "";
    }

    static {
        kge.a(680029886);
        kge.a(450067860);
        b = 0L;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - b < 1000) {
            return true;
        }
        b = elapsedRealtime;
        return false;
    }

    private void a(final Context context, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7db3f7b", new Object[]{this, context, draftModel});
        } else if (draftModel.urlParams == null) {
        } else {
            String str = "1";
            draftModel.urlParams.put("xgc", str);
            draftModel.urlParams.put("is_native_draft", str);
            Map<String, String> map = draftModel.urlParams;
            if (!tek.n()) {
                str = "0";
            }
            map.put(UmiWvPlugin.KEY_XGC_SIMPLE_PUBLISH, str);
            final Uri a2 = ax.a(UmiWvPlugin.NEW_PUBLISH_PATH, draftModel.urlParams);
            final Bundle bundle = new Bundle();
            bundle.putString(com.taobao.umipublish.draft.b.DRAFT_URL_KEY, draftModel.toString());
            au.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiDraftInterceptor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Nav.from(context).withExtras(bundle).toUri(a2);
                    }
                }
            });
        }
    }
}
