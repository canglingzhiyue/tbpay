package com.taobao.pha.core.phacontainer;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.IImageLoader;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.SplashViewIconModel;
import com.taobao.pha.core.p;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.nfz;
import tb.ngn;

/* loaded from: classes7.dex */
public class SplashFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_ARGS_SPLASH_VIEW_HTML = "pha_splash_view_html";
    public static final String FRAGMENT_ARGS_SPLASH_VIEW_ICONS = "pha_splash_view_icons";
    public static final String FRAGMENT_ARGS_SPLASH_VIEW_NAME = "pha_splash_view_name";
    public static final String FRAGMENT_ARGS_SPLASH_VIEW_URL = "pha_splash_view_url";
    public static final String FRAGMENT_TAG = "splash_view";
    private TextView circle1;
    private TextView circle2;
    private TextView circle3;
    public nfz mSplashPageView;
    private ValueAnimator valueAnimator;

    static {
        kge.a(633568727);
    }

    public static /* synthetic */ Object ipc$super(SplashFragment splashFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public static /* synthetic */ TextView access$000(SplashFragment splashFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5f5d1567", new Object[]{splashFragment}) : splashFragment.circle1;
    }

    public static /* synthetic */ TextView access$100(SplashFragment splashFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("3d507b46", new Object[]{splashFragment}) : splashFragment.circle2;
    }

    public static /* synthetic */ TextView access$200(SplashFragment splashFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1b43e125", new Object[]{splashFragment}) : splashFragment.circle3;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        long j = arguments.getLong("AppControllerInstanceId");
        String string = arguments.getString(FRAGMENT_ARGS_SPLASH_VIEW_URL);
        String string2 = arguments.getString(FRAGMENT_ARGS_SPLASH_VIEW_HTML);
        if (StringUtils.isEmpty(string) && StringUtils.isEmpty(string2)) {
            View inflate = layoutInflater.inflate(R.layout.splash_view, viewGroup, false);
            initNonWebViewSplashView(arguments.getSerializable(FRAGMENT_ARGS_SPLASH_VIEW_ICONS), arguments.getString(FRAGMENT_ARGS_SPLASH_VIEW_NAME), inflate);
            return inflate;
        }
        AppController b = AppController.b(j);
        if (b == null) {
            return null;
        }
        PageModel pageModel = new PageModel();
        pageModel.setUrl(string);
        pageModel.html = string2;
        this.mSplashPageView = ngn.a(b, pageModel);
        nfz nfzVar = this.mSplashPageView;
        if (nfzVar == null) {
            return null;
        }
        return nfzVar.j();
    }

    private void initNonWebViewSplashView(Object obj, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eadc327d", new Object[]{this, obj, str, view});
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.splash_icon);
        TextView textView = (TextView) view.findViewById(R.id.splash_name);
        this.circle1 = (TextView) view.findViewById(R.id.circle1);
        this.circle2 = (TextView) view.findViewById(R.id.circle2);
        this.circle3 = (TextView) view.findViewById(R.id.circle3);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.splash_back);
        TextView textView2 = (TextView) view.findViewById(R.id.splash_title);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() > 0) {
                Object obj2 = arrayList.get(0);
                if (obj2 instanceof SplashViewIconModel) {
                    SplashViewIconModel splashViewIconModel = (SplashViewIconModel) obj2;
                    IImageLoader t = p.b().t();
                    if (t != null && !StringUtils.isEmpty(splashViewIconModel.src)) {
                        t.a(imageView, splashViewIconModel.src);
                    }
                }
            }
        }
        if (!StringUtils.isEmpty(str)) {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.pha.core.phacontainer.SplashFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        SplashFragment.this.getActivity().finish();
                    }
                }
            });
        }
        this.valueAnimator = ValueAnimator.ofInt(0, 2);
        this.valueAnimator.setRepeatMode(1);
        this.valueAnimator.setDuration(1000L);
        this.valueAnimator.setRepeatCount(-1);
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.phacontainer.SplashFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue == 0) {
                    SplashFragment.access$000(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle1);
                    SplashFragment.access$100(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle2);
                    SplashFragment.access$200(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle3);
                } else if (intValue == 1) {
                    SplashFragment.access$000(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle3);
                    SplashFragment.access$100(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle1);
                    SplashFragment.access$200(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle2);
                } else {
                    SplashFragment.access$000(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle2);
                    SplashFragment.access$100(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle3);
                    SplashFragment.access$200(SplashFragment.this).setBackgroundResource(R.drawable.shape_circle1);
                }
            }
        });
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.valueAnimator != null) {
            this.valueAnimator = null;
        }
        nfz nfzVar = this.mSplashPageView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.g();
    }
}
