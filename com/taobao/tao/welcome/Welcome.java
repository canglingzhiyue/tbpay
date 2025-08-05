package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.widget.TabHost;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.uikit.immersive.ITBImmersive;
import tb.gvt;
import tb.kge;

@PopLayer.PopupAllowedFromFragment
@PopLayer.PopupOnlyManually
/* loaded from: classes.dex */
public class Welcome extends SupportActivity implements ActivityCompat.OnRequestPermissionsResultCallback, TabHost.OnTabChangeListener, com.taobao.android.editionswitcher.boarding.b, com.taobao.tao.navigation.c, com.taobao.tao.welcome.fragments.c, ITBImmersive {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HostController welController = null;

    static {
        kge.a(609362965);
        kge.a(-1315526134);
        kge.a(1311616296);
        kge.a(1329579186);
        kge.a(-213345416);
        kge.a(-802272639);
        kge.a(-328613967);
    }

    public static /* synthetic */ Object ipc$super(Welcome welcome, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1835627922:
                super.onPostCreate((Bundle) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
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

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        gvt.a("w-onCreate");
        this.welController = HostController.create(this);
        if (this.welController.onPreCreate(bundle)) {
            super.onCreate(bundle);
            return;
        }
        gvt.a("w-super-onCreate");
        super.onCreate(bundle);
        if (l.b((Context) this)) {
            com.taobao.android.autosize.f.a((Activity) this);
        }
        gvt.a();
        gvt.a("w-c-onCreate");
        this.welController.onCreate(bundle);
        gvt.a();
        gvt.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d697592", new Object[]{this, bundle});
            return;
        }
        gvt.a("w-onPostCreate");
        super.onPostCreate(bundle);
        gvt.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        gvt.a("w-onStart");
        super.onStart();
        gvt.a();
        if (this.welController == null) {
            return;
        }
        gvt.a("w-c-onStart");
        this.welController.onStart();
        gvt.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        gvt.a("w-onResume");
        super.onResume();
        gvt.a();
        if (this.welController == null) {
            return;
        }
        gvt.a("w-c-onResume");
        this.welController.onResume();
        gvt.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onStop();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        gvt.a("w-onResume");
        super.onNewIntent(intent);
        gvt.a();
        if (this.welController == null) {
            return;
        }
        gvt.a("w-c-onResume");
        this.welController.onNewIntent(intent);
        gvt.a();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onDestroy();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return false;
        }
        return hostController.isFragmentSupported(str, iSupportFragment);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!isFinishing() && i == 3) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            if (hostController.onKeyDown(i, keyEvent)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onActivityResult(i, i2, intent);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        gvt.a("TabHost-onTabChanged");
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onTabChanged(str);
        }
        gvt.a();
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.doLogin();
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        gvt.a("ITBLoginCallback-checkLogin");
        HostController hostController = this.welController;
        if (hostController != null) {
            z = hostController.checkLogin();
        }
        gvt.a();
        return z;
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return false;
        }
        return hostController.isImmersive();
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
            return;
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onConfirmed(i);
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
            return;
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onRejected(i);
    }

    @Override // com.taobao.android.editionswitcher.boarding.b
    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
            return;
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return;
        }
        hostController.onLocaleSetDone();
    }
}
