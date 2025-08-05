package com.taobao.android.pissarro;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;
import com.taobao.android.pissarro.external.ServiceImpl;
import com.taobao.taobao.R;
import tb.ici;
import tb.kge;

/* loaded from: classes6.dex */
public class ImageChoiceActivity extends FragmentActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f14651a;
    private boolean b = true;
    private Config c;

    static {
        kge.a(-1288965130);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(ImageChoiceActivity imageChoiceActivity, String str, Object... objArr) {
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

    public static /* synthetic */ void a(ImageChoiceActivity imageChoiceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f7b6a3", new Object[]{imageChoiceActivity});
        } else {
            super.finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Pissarro_Float_Activity);
        super.onCreate(bundle);
        setContentView(R.layout.pissarro_choice_dialog);
        this.c = (Config) getIntent().getSerializableExtra("config");
        this.f14651a = findViewById(R.id.content);
        this.f14651a.startAnimation(a());
        findViewById(R.id.button_camera).setOnClickListener(this);
        findViewById(R.id.button_gallery).setOnClickListener(this);
        findViewById(R.id.button_cancel).setOnClickListener(this);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (this.b) {
            ici.a(this);
        }
        Animation b = b();
        b.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.pissarro.ImageChoiceActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    ImageChoiceActivity.a(ImageChoiceActivity.this);
                }
            }
        });
        View view = this.f14651a;
        if (view != null) {
            view.startAnimation(b);
        } else {
            super.finish();
        }
    }

    private Animation a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("367601ae", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private Animation b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("97c89e4d", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.button_cancel) {
            setResult(0, null);
            this.b = true;
            finish();
        } else if (id == R.id.button_camera) {
            Log.e("TaopaiRecord", " onClick camera");
            ServiceImpl.a(this, this.c);
            setResult(-1, null);
            this.b = false;
            Log.e("TaopaiRecord", " onClick camera end");
            super.finish();
        } else if (id != R.id.button_gallery) {
        } else {
            ServiceImpl.b(this, this.c);
            setResult(-1, null);
            this.b = false;
            Log.e("TaopaiRecord", " onClick button_gallery end");
            super.finish();
        }
    }
}
