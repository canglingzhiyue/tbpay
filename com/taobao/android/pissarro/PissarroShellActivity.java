package com.taobao.android.pissarro;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;
import com.taobao.android.autosize.l;
import com.taobao.android.nav.Nav;
import com.taobao.android.pissarro.remote.b;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taopai.business.common.model.TaopaiParams;
import com.taobao.taopai.business.image.external.Image;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.icd;
import tb.ice;
import tb.icf;
import tb.ici;
import tb.ios;
import tb.kge;
import tb.puv;

/* loaded from: classes6.dex */
public class PissarroShellActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FUN = "key_fun";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f14653a = new HashMap();

    static {
        kge.a(-1686939645);
    }

    public static /* synthetic */ Object ipc$super(PissarroShellActivity pissarroShellActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        d();
        if (b.a()) {
            TLog.loge("PissarroShellActivity", "jumpTaopai start");
            a();
            return;
        }
        TLog.logi("PissarroShellActivity", "finish");
        Toast.makeText(this, getString(R.string.pissarro_function_wait), 0).show();
        finish();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (icd.b() && (l.d((Context) this) || l.b((Context) this))) {
            f.a((Activity) this);
            TLog.loge("PissarroShellActivity", "isFoldDevice setOrientation");
        } else {
            setRequestedOrientation(1);
            TLog.loge("PissarroShellActivity", "is phone setOrientation portrait");
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        ici.a(this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1) {
            ici.a(this);
        } else if (i == 100 || i == 101 || i == 102) {
            a(intent);
        }
        finish();
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        List<Image> list = null;
        String stringExtra = intent.getStringExtra(icf.KEY_IMAGE_PATH);
        if (!TextUtils.isEmpty(stringExtra)) {
            list = a(stringExtra);
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Image image : list) {
                com.taobao.android.pissarro.external.Image image2 = new com.taobao.android.pissarro.external.Image();
                image2.setPath(image.getPath());
                image2.setFileId(image.getFileId());
                image2.setResourceUrl(image.getCdnURL());
                image2.setCoverUrl(image.getCoverUrl());
                image2.setCoverPath(image.getCoverPath());
                image2.setMediaType(image.getType());
                image2.setWidth(image.getWidth());
                image2.setHeight(image.getHeight());
                image2.setDuration(image.getDuration() / 1000);
                arrayList.add(image2);
            }
            Intent intent2 = new Intent();
            intent2.putExtra(icf.KEY_IMAGE_PATH, list.get(0).getPath());
            setResult(-1, intent2);
            ici.a(this, arrayList);
            e.a("tp_windvane", "succeed", this.f14653a);
            return;
        }
        int intExtra = intent.getIntExtra("errorCode", -1);
        String stringExtra2 = intent.getStringExtra("errorMsg");
        ici.a(this, intExtra, stringExtra2);
        this.f14653a.put("error_code", String.valueOf(intExtra));
        this.f14653a.put(MUSAppMonitor.ERROR_MSG, stringExtra2);
        e.a("tp_windvane", "fail", this.f14653a);
    }

    private List<Image> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        List<Image> list = null;
        try {
            list = JSON.parseArray(str, Image.class);
        } catch (Throwable th) {
            TLog.loge("PissarroShellActivity", "getImages fastjson error = " + th.getMessage());
            this.f14653a.put(PushMessageHelper.ERROR_TYPE, "get image fastjson error");
            this.f14653a.put("error_detail", th.getMessage());
            this.f14653a.put("json_origin", URLEncoder.encode(str));
        }
        if (list == null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Image image = new Image();
                        image.setId(jSONObject.optString("id"));
                        image.setSequence(jSONObject.optInt("sequence"));
                        image.setPath(jSONObject.optString("path"));
                        image.setCoverPath(jSONObject.optString("coverPath"));
                        image.setWidth(jSONObject.optInt("width"));
                        image.setHeight(jSONObject.optInt("height"));
                        image.setCdnURL(jSONObject.optString("cdnURL"));
                        image.setCoverUrl(jSONObject.optString("coverUrl"));
                        image.setFileId(jSONObject.optString("fileId"));
                        image.setDuration(jSONObject.optInt("duration"));
                        image.setType(jSONObject.optString("type"));
                        list.add(image);
                    }
                }
            } catch (Throwable th2) {
                TLog.loge("PissarroShellActivity", "getImages System error = " + th2.getMessage());
                this.f14653a.put(PushMessageHelper.ERROR_TYPE, "get image System json error");
                this.f14653a.put("error_detail", th2.getMessage());
            }
        }
        return list;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        puv.a().a(ice.a());
        if (puv.a().b() != null) {
            this.f14653a.put(ios.KEY_BIZ_LINE, puv.a().b().q());
            this.f14653a.put("biz_code", puv.a().b().s());
            this.f14653a.put("biz_scene", puv.a().b().r());
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int intExtra = getIntent().getIntExtra(KEY_FUN, 1);
        if (intExtra == 0) {
            String str = c.a().b().getFacing() == 1 ? d.URL_CAMERA_FRONT_FACING : d.URL_CAMERA_BACK_FACING;
            if (c.a().b().isDisableAlbumSelect()) {
                str = str + "&show_video_pick=0";
            }
            Nav.from(this).forResult(100).toUri(str);
        } else if (intExtra == 1) {
            if (TextUtils.equals(e(), "com.taobao.taopai.business.image.album.ImageGalleryActivity")) {
                TLog.loge("PissarroShellActivity", "jump taopai image gallery activity repeat , return");
            } else {
                Nav.from(this).forResult(101).toUri(ice.b());
            }
        } else if (intExtra == 2) {
            c();
        } else {
            Log.e("TaopaiRecord", " PissarroShellActivity finish by default = ");
            finish();
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        try {
            if (activityManager.getRunningTasks(1) != null && activityManager.getRunningTasks(1).size() != 0 && activityManager.getRunningTasks(1).get(0).topActivity != null) {
                return activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Serializable from = TaopaiParams.from(Uri.parse(d.URL_IMAGE_EDIT));
        Bundle bundle = new Bundle();
        bundle.putString(icf.KEY_IMAGE_PATH, getIntent().getStringExtra(icf.KEY_IMAGE_PATH));
        bundle.putSerializable("pissaro_taopai_param", from);
        com.taobao.taopai.business.bizrouter.c.a(this).a(d.URL_IMAGE_EDIT, bundle, 102);
    }
}
