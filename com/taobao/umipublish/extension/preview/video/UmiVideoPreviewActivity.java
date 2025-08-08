package com.taobao.umipublish.extension.preview.video;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.android.litecreator.base.workflow.d;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.widgets.e;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.c;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.preview.BasePreviewActivity;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.HashMap;
import tb.emh;
import tb.gww;
import tb.hfd;
import tb.icf;
import tb.ios;
import tb.kge;
import tb.tek;

@WorkflowNode(bothWay = true, checkerClassName = "com.taobao.umipublish.extension.preview.VideoChecker")
/* loaded from: classes9.dex */
public class UmiVideoPreviewActivity extends BasePreviewActivity implements com.taobao.android.litecreator.base.workflow.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CAN_DELETE_VIDEO = "canDeleteVideo";
    public static final String KEY_CAN_EDIT_COVER = "canEditCover";
    public static final String KEY_CAN_EDIT_VIDEO = "canEditVideo";
    public static final String PAGE_NAME = "Page_GGVideoCheck";
    public IUGCMedia f;

    static {
        kge.a(-1782290588);
        kge.a(-2075868257);
    }

    public static /* synthetic */ Object ipc$super(UmiVideoPreviewActivity umiVideoPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1630383126:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PAGE_NAME;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "a2116i.b10448971";
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        d.a(this);
        super.finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        d.a(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
        if (i != 4 || i2 != -1) {
            return;
        }
        intent.putExtra("action", "change_cover");
        setResult(i2, intent);
        finish();
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        d.b(this, getIntent());
        if (d.a(this, getIntent())) {
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("videoPath");
        String stringExtra2 = intent.getStringExtra("ratio");
        boolean z = (intent.getBooleanExtra(KEY_CAN_EDIT_VIDEO, false) && this.f.getVideos() != null && this.f.getVideos().get(0) != null && this.f.getVideos().get(0).editorInfo != null) && tek.b();
        boolean booleanExtra = intent.getBooleanExtra(KEY_CAN_EDIT_COVER, false);
        boolean booleanExtra2 = intent.getBooleanExtra(KEY_CAN_DELETE_VIDEO, true);
        PreviewModel a2 = PreviewModel.a(stringExtra, stringExtra2);
        a2.g = b.a(R.string.gg_pub_change_cover);
        this.d.a(a2);
        this.d.a(new hfd(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                UmiVideoPreviewActivity.this.c();
                HashMap hashMap = new HashMap();
                hashMap.put("biz_scene", UmiVideoPreviewActivity.a(UmiVideoPreviewActivity.this));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.b(UmiVideoPreviewActivity.this));
                UmiVideoPreviewActivity.c(UmiVideoPreviewActivity.this).b("Cover", hashMap);
            }
        }));
        this.d.b(z);
        this.d.b(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Nav.from(UmiVideoPreviewActivity.this).toUri(gww.a(e.b(UmiVideoPreviewActivity.this.f)).b("VIDEO_EDIT_PATH"));
                HashMap hashMap = new HashMap();
                hashMap.put("biz_scene", UmiVideoPreviewActivity.d(UmiVideoPreviewActivity.this));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.e(UmiVideoPreviewActivity.this));
                UmiVideoPreviewActivity.f(UmiVideoPreviewActivity.this).b(icf.a.CONTROL_EDIT, hashMap);
            }
        });
        this.d.c(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                new e.a(UmiVideoPreviewActivity.this).b(b.a(R.string.gg_pub_confirm_delete_video)).a(b.a(R.string.gg_pub_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", (Object) "video");
                        jSONObject2.put("path", (Object) UmiVideoPreviewActivity.g(UmiVideoPreviewActivity.this).e.get(0).path);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(jSONObject2);
                        jSONObject.put("deleteItems", (Object) jSONArray);
                        jSONObject.put("leftCount", (Object) 0);
                        Intent intent2 = new Intent();
                        intent2.putExtra("data", jSONObject.toJSONString());
                        intent2.putExtra("action", "delete");
                        if (UmiVideoPreviewActivity.this.f != null) {
                            UmiVideoPreviewActivity.this.f.getVideos().clear();
                            UmiVideoPreviewActivity.this.f.setMeta("ugc_video_from_album_input", "");
                            UmiVideoPreviewActivity.this.f.setMeta("result_data", m.a(intent2));
                        } else {
                            UmiVideoPreviewActivity.this.setResult(-1, intent2);
                        }
                        UmiVideoPreviewActivity.this.finish();
                    }
                }).b(b.a(R.string.gg_pub_cancel), (DialogInterface.OnClickListener) null).a(true).b().show();
                HashMap hashMap = new HashMap();
                hashMap.put("biz_scene", UmiVideoPreviewActivity.h(UmiVideoPreviewActivity.this));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.i(UmiVideoPreviewActivity.this));
                UmiVideoPreviewActivity.j(UmiVideoPreviewActivity.this).b(Constant.VALUE_NAME_VPR_DELETE, hashMap);
            }
        });
        this.d.a(booleanExtra);
        this.d.c(booleanExtra2);
        this.e = a2;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        d.c(this, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi16, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed253ea", new Object[]{this, intent, new Integer(i), bundle});
        } else {
            super.startActivityForResult(intent, d.a(this, intent, i, bundle), bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.litecreator.base.data.IUGCMedia, com.taobao.android.litecreator.base.workflow.IWorkflowData] */
    @Override // com.taobao.android.litecreator.base.workflow.b
    public /* synthetic */ IUGCMedia get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWorkflowData) ipChange.ipc$dispatch("5ff9e26c", new Object[]{this}) : d();
    }

    public UmiVideoPreviewActivity() {
        j.b(j.h().e(), c.TAOPAI_FEATURE);
    }

    public static /* synthetic */ String a(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("981f038b", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.f23243a;
    }

    public static /* synthetic */ String b(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7dca600c", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a c(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("b3e4339b", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.c;
    }

    public static /* synthetic */ String d(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4921190e", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.f23243a;
    }

    public static /* synthetic */ String e(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ecc758f", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a f(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("5940ea38", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.c;
    }

    public static /* synthetic */ PreviewModel g(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreviewModel) ipChange.ipc$dispatch("fe9a36e0", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.e;
    }

    public static /* synthetic */ String h(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfce8b12", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.f23243a;
    }

    public static /* synthetic */ String i(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c579e793", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a j(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("8b11ddb4", new Object[]{umiVideoPreviewActivity}) : umiVideoPreviewActivity.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            PreviewModel.Media a2 = this.d.a();
            String str = a2.path;
            String str2 = a2.ratio;
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                return;
            }
            Uri.Builder path = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/tpdefault.html");
            IUGCMedia iUGCMedia = this.f;
            if (iUGCMedia != null) {
                path = Uri.parse(UmiWvPlugin.getCoverPickPath(iUGCMedia.getPublishSessionId())).buildUpon();
            }
            Uri.Builder appendQueryParameter = path.appendQueryParameter("scene", "selectCover").appendQueryParameter("biz_scene", "template");
            appendQueryParameter.appendQueryParameter("elements", "[{\"fileUrl\": \"" + str + "\"}]");
            if (emh.sDefaultDimension.equals(str2)) {
                path.appendQueryParameter("shot_ratio", "0001");
                path.appendQueryParameter("trackdatas", "{\"umi_cover_ratio\":\"1\", \"tid\": \"-1\"}");
            } else {
                path.appendQueryParameter("trackdatas", "{\"umi_cover_ratio\":\"0\", \"tid\": \"-1\"}");
            }
            Nav.from(this).forResult(4).toUri(path.build());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.base.workflow.c
    public void in(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0ca12a", new Object[]{this, iUGCMedia});
        } else {
            this.f = iUGCMedia;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.base.workflow.a, com.taobao.android.litecreator.base.workflow.c
    /* renamed from: out */
    public IUGCMedia mo1569out() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUGCMedia) ipChange.ipc$dispatch("91970c1f", new Object[]{this}) : this.f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.base.workflow.c
    public void update(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6590ce", new Object[]{this, iUGCMedia});
            return;
        }
        this.f = iUGCMedia;
        Intent intent = new Intent();
        intent.putExtra("action", "change_cover");
        this.f.setMeta("result_data", m.a(intent));
        finish();
    }

    public IUGCMedia d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUGCMedia) ipChange.ipc$dispatch("36bcba49", new Object[]{this}) : this.f;
    }
}
