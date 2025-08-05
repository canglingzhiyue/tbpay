package com.taobao.umipublish.extension.windvane.innercall;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.b;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.umipublish.extension.windvane.IMaterialVersionChecker;
import com.taobao.umipublish.extension.windvane.innercall.NavWrapperFragment;
import com.taobao.umipublish.framework.a;
import com.taobao.umipublish.framework.d;
import tb.ios;
import tb.kge;
import tb.sqj;

/* loaded from: classes9.dex */
public class InnerOpenRecordAbility extends InnerCallBaseAbility implements NavWrapperFragment.ActivityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_INNER_OPEN_RECORD_PAGE = "event_inner_open_record_page";
    private static final String NEW_RECORD_PATH = "https://h5.m.taobao.com/litecreator/no_result_record.html";
    private static final int REQUEST_CODE = 3301;
    private static final String TAG = "InnerOpenRecordAbility";

    static {
        kge.a(-313719541);
        kge.a(-1332976034);
    }

    public static /* synthetic */ Object ipc$super(InnerOpenRecordAbility innerOpenRecordAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(InnerOpenRecordAbility innerOpenRecordAbility, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6491ea82", new Object[]{innerOpenRecordAbility, jSONObject});
        } else {
            innerOpenRecordAbility.c(jSONObject);
        }
    }

    public static /* synthetic */ void a(InnerOpenRecordAbility innerOpenRecordAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6f8442", new Object[]{innerOpenRecordAbility, str, str2});
        } else {
            innerOpenRecordAbility.errorCallback(str, str2);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void a(final JSONObject jSONObject, ios.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e01202e", new Object[]{this, jSONObject, aVar});
        } else {
            ((IMaterialVersionChecker) b.a(IMaterialVersionChecker.class, new Object[0])).check(this.mContext, 0, jSONObject, new sqj.a() { // from class: com.taobao.umipublish.extension.windvane.innercall.InnerOpenRecordAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sqj.a
                public void a(MaterialDetail materialDetail) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
                    } else {
                        InnerOpenRecordAbility.a(InnerOpenRecordAbility.this, jSONObject);
                    }
                }

                @Override // tb.sqj.a
                public void a(MaterialDetail materialDetail, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c82d1e96", new Object[]{this, materialDetail, str, str2});
                    } else {
                        InnerOpenRecordAbility.a(InnerOpenRecordAbility.this, str, str2);
                    }
                }
            });
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) this.mContext).getSupportFragmentManager();
        if (!supportFragmentManager.isDestroyed()) {
            NavWrapperFragment navWrapperFragment = new NavWrapperFragment(this);
            supportFragmentManager.beginTransaction().add(navWrapperFragment, (String) null).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
            b(jSONObject);
            Nav.from(this.mContext).withFragment(navWrapperFragment).forResult(REQUEST_CODE).toUri(ax.a(NEW_RECORD_PATH, jSONObject));
            return;
        }
        errorCallback("3", "ACTIVITY_FINISHED");
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.NavWrapperFragment.ActivityResult
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        u.b(TAG, "requestCode=" + i + ", resultCode=" + i2);
        if (i != REQUEST_CODE) {
            return;
        }
        a(this.f23354a);
        errorCallback("-2", com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        a(jSONObject);
        a.a().a(EVENT_INNER_OPEN_RECORD_PAGE, d.a().a("event", g4.b.i));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a();
        a.a().a(EVENT_INNER_OPEN_RECORD_PAGE, d.a().a("event", "exit"));
    }
}
