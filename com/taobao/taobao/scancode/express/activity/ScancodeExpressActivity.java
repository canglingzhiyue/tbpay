package com.taobao.taobao.scancode.express.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class ScancodeExpressActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1132595189);
    }

    public static /* synthetic */ Object ipc$super(ScancodeExpressActivity scancodeExpressActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.kakalib_default_activity_express);
        a();
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ScancodeExpressFragment(), "express").commit();
        oys.a().a("Express_UI_detail");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Button button = (Button) findViewById(R.id.kakalib_button_nav_left);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.express.activity.ScancodeExpressActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ScancodeExpressActivity.this.onBackPressed();
                }
            }
        });
        button.setText(R.string.kakalib_express_info);
    }
}
