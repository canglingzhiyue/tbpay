package com.taobao.umipublish.extension.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.m;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity;
import tb.kge;

/* loaded from: classes9.dex */
public class MixPreviewActivity extends UmiImagePreviewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String g = UmiImagePreviewActivity.PAGE_NAME;
    private String h = "a2116i.b10340776";
    private boolean n;

    static {
        kge.a(264564816);
    }

    public static /* synthetic */ Object ipc$super(MixPreviewActivity mixPreviewActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1150324634) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.finish();
            return null;
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ JSONArray a(MixPreviewActivity mixPreviewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("478c8917", new Object[]{mixPreviewActivity}) : mixPreviewActivity.l;
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.n = getIntent().getBooleanExtra("rateAnimEnable", false);
        this.d.d(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.MixPreviewActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                MixPreviewActivity.this.c.b("Back", null);
                if (!MixPreviewActivity.a(MixPreviewActivity.this).isEmpty()) {
                    MixPreviewActivity.this.e();
                } else {
                    MixPreviewActivity.this.finish();
                }
            }
        });
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public String a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent}) : intent.getStringExtra("inputMedias");
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public PreviewModel a(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreviewModel) ipChange.ipc$dispatch("1d5d4894", new Object[]{this, str, new Integer(i), jSONArray, new Boolean(z)}) : PreviewModel.b(str, i, jSONArray, z);
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String stringExtra = getIntent().getStringExtra("pageName");
        if (!StringUtils.isEmpty(stringExtra)) {
            this.g = stringExtra;
        }
        return this.g;
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String stringExtra = getIntent().getStringExtra("spm");
        if (!StringUtils.isEmpty(stringExtra)) {
            this.h = stringExtra;
        }
        return this.h;
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deleteItemsPos", (Object) this.l);
        jSONObject.put("deleteItems", (Object) this.m);
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
        if (this.f == null) {
            setResult(-1, intent);
        } else {
            this.f.getVideos().clear();
            this.f.setMeta("ugc_video_from_album_input", "");
            this.f.setMeta("result_data", m.a(intent));
        }
        finish();
    }

    public void d() {
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
        this.l.add(Integer.valueOf(b));
        this.m.add(a3);
        if (a2.type == 0 && this.f != null) {
            a(a2);
        }
        if (!this.e.e.isEmpty()) {
            return;
        }
        e();
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (!this.n) {
            return;
        }
        overridePendingTransition(17432576, 17432577);
    }
}
