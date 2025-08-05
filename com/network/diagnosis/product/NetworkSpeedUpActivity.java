package com.network.diagnosis.product;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.cze;

/* loaded from: classes4.dex */
public class NetworkSpeedUpActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Switch f8069a;
    private Switch b;
    private RelativeLayout c;

    public static /* synthetic */ Object ipc$super(NetworkSpeedUpActivity networkSpeedUpActivity, String str, Object... objArr) {
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
        setContentView(R.layout.network_speed_up);
        getSupportActionBar().a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14010));
        getSupportActionBar().b(getResources().getDrawable(R.color.nd_white));
        this.f8069a = (Switch) findViewById(R.id.switch_settings_multi_path);
        this.f8069a.setChecked(NetworkConfigCenter.isMultiPathOpened());
        this.f8069a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.network.diagnosis.product.NetworkSpeedUpActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else {
                    NetworkConfigCenter.setMultiPathOpened(z);
                }
            }
        });
        this.c = (RelativeLayout) findViewById(R.id.layout_settings_multi_quic);
        if (cze.c()) {
            this.c.setVisibility(0);
        }
        this.b = (Switch) findViewById(R.id.switch_settings_multi_quic);
        this.b.setChecked(NetworkConfigCenter.isMPQuicOpened());
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.network.diagnosis.product.NetworkSpeedUpActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else {
                    NetworkConfigCenter.setMPQuicOpened(z);
                }
            }
        });
    }
}
