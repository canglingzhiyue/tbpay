package com.taobao.android.stdpop.api.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes6.dex */
public final class PanelBuildFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONTENT = "content";
    public static final a Companion;
    private static final String IS_WEEX_URL = "isWeex";
    private static final String URL = "url";
    private TMSEmbed mInstance;
    private StartParams mParams;

    static {
        kge.a(417202958);
        Companion = new a(null);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1804072150);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final Fragment a(com.taobao.android.stdpop.api.viewpager.a info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("17982f2e", new Object[]{this, info});
            }
            q.d(info, "info");
            PanelBuildFragment panelBuildFragment = new PanelBuildFragment();
            Bundle bundle = new Bundle();
            if (e.a().b(info.c())) {
                bundle.putBoolean(PanelBuildFragment.IS_WEEX_URL, true);
            } else {
                bundle.putBoolean(PanelBuildFragment.IS_WEEX_URL, false);
            }
            bundle.putString("url", info.c());
            bundle.putSerializable("content", info.d());
            panelBuildFragment.setArguments(bundle);
            return panelBuildFragment;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        TMSEmbed tMSEmbed;
        TMSEmbed tMSEmbed2;
        String string;
        StartParams startParams;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.std_fragment_container, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean(IS_WEEX_URL);
        }
        View view = null;
        if (z) {
            Weex2StartParams weex2StartParams = new Weex2StartParams();
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable("content") : null;
            if (!(serializable instanceof JSONObject)) {
                serializable = null;
            }
            weex2StartParams.setInitData((JSONObject) serializable);
            t tVar = t.INSTANCE;
            this.mParams = weex2StartParams;
            FragmentActivity it1 = getActivity();
            if (it1 != null) {
                q.b(it1, "it1");
                tMSEmbed = new TMSEmbed(it1, TMSEmbedSolutionType.WEEX);
            }
            tMSEmbed = null;
        } else {
            this.mParams = new WebStartParams();
            FragmentActivity it12 = getActivity();
            if (it12 != null) {
                q.b(it12, "it1");
                tMSEmbed = new TMSEmbed(it12, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
            }
            tMSEmbed = null;
        }
        this.mInstance = tMSEmbed;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("url")) != null && (startParams = this.mParams) != null) {
            startParams.setUrl(string);
        }
        StartParams startParams2 = this.mParams;
        if (startParams2 != null && (tMSEmbed2 = this.mInstance) != null) {
            tMSEmbed2.a(startParams2);
        }
        TMSEmbed tMSEmbed3 = this.mInstance;
        if (tMSEmbed3 != null) {
            view = tMSEmbed3.b();
        }
        TMSEmbed tMSEmbed4 = this.mInstance;
        if (tMSEmbed4 != null) {
            tMSEmbed4.a();
        }
        if (view != null) {
            frameLayout.addView(view);
        }
        return frameLayout;
    }
}
