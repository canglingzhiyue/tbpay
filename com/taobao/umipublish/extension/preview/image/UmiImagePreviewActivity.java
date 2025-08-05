package com.taobao.umipublish.extension.preview.image;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.android.litecreator.base.workflow.d;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.widgets.e;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taopai.business.image.edit.entities.Elements;
import com.taobao.umipublish.extension.preview.BasePreviewActivity;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.preview.c;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hfd;
import tb.icf;
import tb.ios;
import tb.kge;
import tb.rcx;
import tb.tek;

@WorkflowNode(bothWay = true)
/* loaded from: classes9.dex */
public class UmiImagePreviewActivity extends BasePreviewActivity implements com.taobao.android.litecreator.base.workflow.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_GGPicCheck";
    public IUGCMedia f;
    private JSONArray g;
    private Handler h;
    public JSONArray i;
    public List<String> j;
    public JSONArray l;
    public JSONArray m;
    private boolean n;

    static {
        kge.a(1697868644);
        kge.a(-2075868257);
    }

    public static /* synthetic */ Object ipc$super(UmiImagePreviewActivity umiImagePreviewActivity, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "a2116i.b10340776";
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
        intent.putExtra("action", "edit");
        intent.putExtra("origin_image", this.d.a().originData.toString());
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
        this.i = new JSONArray();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("recordUrl");
        this.g = JSON.parseArray(a(intent));
        int intExtra = intent.getIntExtra("currentIdx", 0);
        boolean booleanExtra = intent.getBooleanExtra("canEdit", false);
        boolean booleanExtra2 = intent.getBooleanExtra("canDelete", false);
        final boolean booleanExtra3 = intent.getBooleanExtra(Constants.Name.AUTO_PLAY, true);
        this.n = intent.getBooleanExtra("deleteNeedConfirm", true);
        final PreviewModel a2 = a(stringExtra, intExtra, this.g, booleanExtra);
        a(a2);
        this.d.c(booleanExtra2);
        this.d.a(a2);
        this.d.a(booleanExtra);
        this.d.a(new hfd(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                UmiImagePreviewActivity.this.f();
                HashMap hashMap = new HashMap();
                hashMap.put("biz_scene", UmiImagePreviewActivity.a(UmiImagePreviewActivity.this));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiImagePreviewActivity.b(UmiImagePreviewActivity.this));
                UmiImagePreviewActivity.c(UmiImagePreviewActivity.this).b(icf.a.CONTROL_EDIT, hashMap);
            }
        }));
        this.d.c(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("biz_scene", UmiImagePreviewActivity.d(UmiImagePreviewActivity.this));
                hashMap.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiImagePreviewActivity.e(UmiImagePreviewActivity.this));
                UmiImagePreviewActivity.f(UmiImagePreviewActivity.this).b(Constant.VALUE_NAME_VPR_DELETE, hashMap);
                if (!UmiImagePreviewActivity.g(UmiImagePreviewActivity.this)) {
                    UmiImagePreviewActivity.this.m1567d();
                } else {
                    new e.a(UmiImagePreviewActivity.this).b(b.a(R.string.gg_pub_confirm_delete_photo)).a(b.a(R.string.gg_pub_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.2.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            UmiImagePreviewActivity.a(UmiImagePreviewActivity.this, true);
                            UmiImagePreviewActivity.this.m1567d();
                        }
                    }).b(b.a(R.string.gg_pub_cancel), new DialogInterface.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                UmiImagePreviewActivity.a(UmiImagePreviewActivity.this, false);
                            }
                        }
                    }).a(true).b().show();
                }
            }
        });
        this.d.d(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                UmiImagePreviewActivity.h(UmiImagePreviewActivity.this).b("Back", null);
                if (!UmiImagePreviewActivity.this.i.isEmpty()) {
                    UmiImagePreviewActivity.this.e();
                } else {
                    UmiImagePreviewActivity.this.finish();
                }
            }
        });
        this.d.e(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    UmiImagePreviewActivity.i(UmiImagePreviewActivity.this).b("Music", null);
                }
            }
        });
        this.d.a(new c.a() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.preview.c.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    UmiImagePreviewActivity.j(UmiImagePreviewActivity.this).a("Music", (Map<String, String>) null);
                }
            }

            @Override // com.taobao.umipublish.extension.preview.c.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    UmiImagePreviewActivity.k(UmiImagePreviewActivity.this).b("PicOperate", null);
                }
            }
        });
        this.h.post(new Runnable() { // from class: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                UmiImagePreviewActivity.l(UmiImagePreviewActivity.this).a(a2.b, false);
                if (!booleanExtra3 || tek.a()) {
                    return;
                }
                UmiImagePreviewActivity.m(UmiImagePreviewActivity.this).b(a2.b);
            }
        });
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
        return ipChange instanceof IpChange ? (IWorkflowData) ipChange.ipc$dispatch("5ff9e26c", new Object[]{this}) : c();
    }

    public UmiImagePreviewActivity() {
        j.b(j.h().e(), com.taobao.appbundle.c.TAOPAI_FEATURE);
        this.h = new Handler();
        this.i = new JSONArray();
        this.l = new JSONArray();
        this.m = new JSONArray();
        this.j = new ArrayList();
    }

    public static /* synthetic */ String a(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bde4078b", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.f23243a;
    }

    public static /* synthetic */ void a(UmiImagePreviewActivity umiImagePreviewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984bfbbf", new Object[]{umiImagePreviewActivity, new Boolean(z)});
        } else {
            umiImagePreviewActivity.a(z);
        }
    }

    public static /* synthetic */ String b(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a38f640c", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.b;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a c(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("36a4af9b", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ String d(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ee61d0e", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.f23243a;
    }

    public static /* synthetic */ String e(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5491798f", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.b;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a f(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("dc016638", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ boolean g(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f48d7df3", new Object[]{umiImagePreviewActivity})).booleanValue() : umiImagePreviewActivity.n;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a h(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("f4e9dff6", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a i(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("815e1cd5", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a j(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("dd259b4", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.ut.a k(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.sdk.framework.container.ut.a) ipChange.ipc$dispatch("9a469693", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.c;
    }

    public static /* synthetic */ c l(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6c7dba2d", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.d;
    }

    public static /* synthetic */ c m(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b594c0cc", new Object[]{umiImagePreviewActivity}) : umiImagePreviewActivity.d;
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m1567d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int b = this.d.b();
        PreviewModel.Media a2 = this.d.a(b);
        if (a2 == null) {
            return;
        }
        JSONObject a3 = a(b, a2);
        this.j.add(a2.draftId);
        this.i.add(a3);
        if (this.f != null) {
            a(a2);
        }
        if (!this.e.e.isEmpty()) {
            return;
        }
        e();
    }

    public void a(PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3af9e1", new Object[]{this, media});
            return;
        }
        Iterator<UGCImage> it = this.f.getImages().iterator();
        while (it.hasNext()) {
            UGCImage next = it.next();
            if (next.compress != null && TextUtils.equals(next.compress.path, media.path)) {
                it.remove();
                return;
            }
        }
    }

    public JSONObject a(int i, PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4461f5b4", new Object[]{this, new Integer(i), media});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) (media.type == 0 ? "image" : "video"));
        jSONObject.put("path", (Object) media.path);
        jSONObject.put("extraInfo", (Object) a(i));
        return jSONObject;
    }

    public String a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent}) : intent.getStringExtra("imageDatas");
    }

    public PreviewModel a(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreviewModel) ipChange.ipc$dispatch("1d5d4894", new Object[]{this, str, new Integer(i), jSONArray, new Boolean(z)}) : PreviewModel.a(str, i, jSONArray, z);
    }

    public JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        if (i < this.g.size() && i >= 0 && this.g.getJSONObject(i) != null) {
            return this.g.getJSONObject(i).getJSONObject("extraInfo");
        }
        return null;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("operate", z ? "1" : "0");
        this.c.b("PicDeletePop", hashMap);
    }

    private void a(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a6c2c1", new Object[]{this, previewModel});
            return;
        }
        Music d = d();
        if (d == null) {
            return;
        }
        previewModel.f = new PreviewModel.Music();
        previewModel.f.path = d.path;
        previewModel.f.name = d.name;
    }

    private Music d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Music) ipChange.ipc$dispatch("2a489271", new Object[]{this});
        }
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("music");
        if (!TextUtils.isEmpty(stringExtra)) {
            return (Music) JSON.parseObject(stringExtra, Music.class);
        }
        return null;
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            e();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deleteItems", (Object) this.i);
        jSONObject.put("leftCount", (Object) Integer.valueOf(this.e.e.size()));
        Intent intent = new Intent();
        intent.putExtra("data", jSONObject.toJSONString());
        JSONArray jSONArray = new JSONArray();
        for (PreviewModel.Media media : this.e.e) {
            jSONArray.add(media.originData);
        }
        intent.putExtra("left_images", jSONArray.toString());
        intent.putExtra("action", "delete");
        intent.putExtra("draft_ids", at.a(this.j, ","));
        IUGCMedia iUGCMedia = this.f;
        if (iUGCMedia == null) {
            setResult(-1, intent);
        } else {
            iUGCMedia.setMeta("result_data", m.a(intent));
        }
        finish();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.e != null && this.f != null) {
            ArrayList arrayList = new ArrayList();
            for (PreviewModel.Media media : this.e.e) {
                Elements elements = new Elements();
                elements.setDraftId(media.draftId);
                elements.setFileUrl(media.path);
                arrayList.add(elements);
            }
            Bundle bundle = new Bundle();
            Uri.Builder buildUpon = Uri.parse(UmiWvPlugin.NEW_IMAGEEDIT_PATH).buildUpon();
            buildUpon.appendQueryParameter("scene", "imageEditNew");
            buildUpon.appendQueryParameter("biz_scene", rcx.a().b("biz_scene", ""));
            buildUpon.appendQueryParameter("umi_pub_session", rcx.a().b("umi_pub_session", ""));
            buildUpon.appendQueryParameter("current_image_index", this.d.b() + "");
            Uri build = buildUpon.build();
            if (this.f != null) {
                Intent intent = new Intent();
                intent.putExtra("action", "edit");
                intent.putExtra("origin_image", this.d.a().originData.toString());
                this.f.setMeta("result_data", m.a(intent));
                this.f.setMeta("current_image_index", Integer.valueOf(this.d.b()));
            }
            Nav.from(this).withExtras(bundle).forResult(4).toUri(build);
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
        } else {
            this.f = iUGCMedia;
        }
    }

    public IUGCMedia c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUGCMedia) ipChange.ipc$dispatch("3586676a", new Object[]{this}) : this.f;
    }
}
