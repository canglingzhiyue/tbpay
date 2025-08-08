package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import tb.kge;
import tb.phg;

/* loaded from: classes5.dex */
public abstract class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context c;
    public View d;
    public AliUrlImageView e;
    public AliUrlImageView f;
    public AliUrlImageView g;
    public AliUrlImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public LinearLayout l;
    public b m;
    public c n;
    public com.taobao.alilive.aliliveframework.frame.a o;

    /* loaded from: classes5.dex */
    public interface b {
        TopAtmosphereMessage a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType);

        TopAtmosphereMessage b(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType);
    }

    static {
        kge.a(1575870522);
    }

    public abstract void a(int i);

    public abstract void a(TopAtmosphereMessage topAtmosphereMessage);

    public abstract boolean a();

    public i(Context context, View view, b bVar, c cVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.c = context;
        this.m = bVar;
        this.n = cVar;
        this.o = aVar;
        this.l = (LinearLayout) view.findViewById(R.id.certificate_text);
        this.j = (TextView) view.findViewById(R.id.certificate_title);
        this.d = view.findViewById(R.id.certificate_layout);
        this.f = (AliUrlImageView) view.findViewById(R.id.certificate_tag_icon);
        this.g = (AliUrlImageView) view.findViewById(R.id.brand_icon);
        this.i = (TextView) view.findViewById(R.id.certificate_tag_name);
        this.e = (AliUrlImageView) view.findViewById(R.id.certificate_background);
        this.k = (TextView) view.findViewById(R.id.comment_count_textview);
        this.h = (AliUrlImageView) view.findViewById(R.id.atmosphere_icon);
        this.h.setSkipAutoSize(true);
        this.d.setVisibility(8);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        view.clearAnimation();
        this.d.setVisibility(8);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        layoutParams.setMargins(com.taobao.taolive.room.utils.d.a(this.c, 13.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.l.setLayoutParams(layoutParams);
    }

    public void b(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f95d11", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("msgSubType", topAtmosphereMessage.msgSubType + "");
            hashMap.put("data", JSON.toJSONString(topAtmosphereMessage.data));
            phg.a().a(this.o, ag.SHOW_ATMOSPHERE, hashMap);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.c, R.anim.taolive_certification_in_flexalocal);
            this.d.setVisibility(0);
            loadAnimation.setDuration(500L);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setAnimationListener(new a(i));
            this.d.clearAnimation();
            this.d.startAnimation(loadAnimation);
        } catch (Throwable th) {
            q.b("TopAtmosphereView", "startAnimation e: " + th.getMessage());
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.k.setText(b(str));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        this.k.startAnimation(scaleAnimation);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        return "x" + str + "  ";
    }

    /* loaded from: classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CERTIFICATE_ANIM_END = 2;
        public static final int CERTIFICATE_ANIM_MIDDLE = 1;
        public static final int CERTIFICATE_ANIM_START = 0;
        public static final int COMMENT_COUNT_ANIM_END = 5;
        public static final int COMMENT_COUNT_ANIM_MIDDLE = 4;
        public static final int COMMENT_COUNT_ANIM_START = 3;
        private int b;

        static {
            kge.a(-430445089);
            kge.a(-911284573);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            i.this.d.clearAnimation();
            animation.setAnimationListener(null);
            i.this.a(this.b);
        }
    }
}
