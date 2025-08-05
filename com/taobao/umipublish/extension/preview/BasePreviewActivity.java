package com.taobao.umipublish.extension.preview;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.ut.UtParams;
import com.taobao.taobao.R;
import java.util.Map;
import tb.ios;
import tb.kge;
import tb.rcx;

/* loaded from: classes9.dex */
public abstract class BasePreviewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23243a;
    public String b;
    public com.taobao.android.litecreator.sdk.framework.container.ut.a c;
    public c d;
    public PreviewModel e;
    public Map<String, String> k;

    static {
        kge.a(566821681);
    }

    public static /* synthetic */ Object ipc$super(BasePreviewActivity basePreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract String a();

    public abstract String b();

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = new c(this);
        setContentView(this.d.c());
        a(this, -16777216);
        this.f23243a = rcx.a().a("biz_scene");
        this.b = rcx.a().a(ios.KEY_ONIOLN_FITTING_ROOM_SCENE);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("useIntent", false)) {
            if (TextUtils.isEmpty(this.f23243a)) {
                this.f23243a = intent.getStringExtra("biz_scene");
            }
            if (TextUtils.isEmpty(this.b)) {
                this.b = intent.getStringExtra(ios.KEY_ONIOLN_FITTING_ROOM_SCENE);
            }
            String stringExtra = intent.getStringExtra("track_common_args");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.k = (Map) JSONObject.parseObject(stringExtra, new TypeReference<Map<String, String>>() { // from class: com.taobao.umipublish.extension.preview.BasePreviewActivity.1
                }, new Feature[0]);
            }
            this.c = new com.taobao.android.litecreator.sdk.framework.container.ut.c(a(), b(), this.k);
            return;
        }
        this.c = new com.taobao.android.litecreator.sdk.framework.container.ut.c(a(), b());
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.anim_hold, R.anim.anim_preview_out);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_hold, R.anim.anim_preview_out);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.c.a(this, UtParams.newInstance().putParams("biz_scene", this.f23243a).putParams(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, this.b));
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    private void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{this, activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.f();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }
}
