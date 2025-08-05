package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.ability.impl.audio.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.hsy;
import tb.kge;

/* loaded from: classes2.dex */
public final class AudioFloatWindow extends AbsFloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AudioCollapse audioCollapse;
    private AudioExpand audioExpand;
    private boolean isPlaying;
    private e playParams;
    private a triggerListener;

    @Target({ElementType.TYPE, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes2.dex */
    public @interface StatusCode {
        public static final a Companion = a.f1862a;
        public static final int STATUS_CODE_CLOSE = 2;
        public static final int STATUS_CODE_OPEN = 3;
        public static final int STATUS_CODE_PAUSE = 1;
        public static final int STATUS_CODE_PLAY = 0;

        /* loaded from: classes2.dex */
        public static final class a {
            public static final int STATUS_CODE_CLOSE = 2;
            public static final int STATUS_CODE_OPEN = 3;
            public static final int STATUS_CODE_PAUSE = 1;
            public static final int STATUS_CODE_PLAY = 0;

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f1862a;

            static {
                kge.a(1904909744);
                f1862a = new a();
            }

            private a() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, Object obj);
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AudioFloatWindow.access$collapse(AudioFloatWindow.this);
            }
        }
    }

    static {
        kge.a(313178363);
    }

    public static /* synthetic */ Object ipc$super(AudioFloatWindow audioFloatWindow, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$collapse(AudioFloatWindow audioFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ae1cf2", new Object[]{audioFloatWindow});
        } else {
            audioFloatWindow.collapse();
        }
    }

    public static final /* synthetic */ void access$expand(AudioFloatWindow audioFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b375d7a5", new Object[]{audioFloatWindow});
        } else {
            audioFloatWindow.expand();
        }
    }

    public /* synthetic */ AudioFloatWindow(Context context, a aVar, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AudioFloatWindow(android.content.Context r2, com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.a r3, android.util.AttributeSet r4, int r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r2, r0)
            java.lang.String r0 = "triggerListener"
            kotlin.jvm.internal.q.d(r3, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            kotlin.jvm.internal.q.b(r2, r0)
            r1.<init>(r2, r4, r5)
            r1.triggerListener = r3
            r2 = 1
            r1.isPlaying = r2
            r2 = 0
            r1.level = r2
            r1.initLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.<init>(android.content.Context, com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow$a, android.util.AttributeSet, int):void");
    }

    public final void play(e playParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648afe27", new Object[]{this, playParams});
            return;
        }
        q.d(playParams, "playParams");
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.play(playParams);
        }
        this.playParams = playParams;
        this.isPlaying = true;
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.pause();
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        if (audioCollapse != null) {
            audioCollapse.pause();
        }
        this.isPlaying = false;
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.play();
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        if (audioCollapse != null) {
            audioCollapse.play();
        }
        this.isPlaying = true;
    }

    private final void initLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        Context context = getContext();
        q.b(context, "context");
        Context applicationContext = context.getApplicationContext();
        q.b(applicationContext, "context.applicationContext");
        this.audioCollapse = new AudioCollapse(applicationContext, new AudioFloatWindow$initLayout$1(this), null, 0, 12, null);
        addView(this.audioCollapse);
    }

    private final void expand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20198621", new Object[]{this});
            return;
        }
        if (this.audioExpand == null) {
            Context context = getContext();
            q.b(context, "context");
            Context applicationContext = context.getApplicationContext();
            q.b(applicationContext, "context.applicationContext");
            this.audioExpand = new AudioExpand(applicationContext, this.triggerListener, null, 0, 12, null);
            addView(this.audioExpand);
            AudioExpand audioExpand = this.audioExpand;
            if (audioExpand != null) {
                audioExpand.defaultPlaying = this.isPlaying;
            }
            AudioExpand audioExpand2 = this.audioExpand;
            if (audioExpand2 != null) {
                e eVar = this.playParams;
                q.a(eVar);
                audioExpand2.play(eVar);
            }
            AudioExpand audioExpand3 = this.audioExpand;
            if (audioExpand3 != null) {
                audioExpand3.setOnClickListener(new b());
            }
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        q.a(audioCollapse);
        audioCollapse.setVisibility(4);
        AudioExpand audioExpand4 = this.audioExpand;
        q.a(audioExpand4);
        audioExpand4.setVisibility(0);
        int[] iArr = new int[2];
        AudioCollapse audioCollapse2 = this.audioCollapse;
        q.a(audioCollapse2);
        audioCollapse2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (i <= 0) {
            Context context2 = getContext();
            q.b(context2, "context");
            int a2 = i2 - hsy.a(context2, 10.5f);
            AudioExpand audioExpand5 = this.audioExpand;
            q.a(audioExpand5);
            audioExpand5.layout(0, a2, false);
            AudioExpand audioExpand6 = this.audioExpand;
            q.a(audioExpand6);
            audioExpand6.showOpenTranslateAnimation(false);
            return;
        }
        Context context3 = getContext();
        q.b(context3, "context");
        int i3 = hsy.a(context3).widthPixels;
        Context context4 = getContext();
        q.b(context4, "context");
        int a3 = i3 - hsy.a(context4, 169.0f);
        Context context5 = getContext();
        q.b(context5, "context");
        int a4 = i2 - hsy.a(context5, 10.5f);
        AudioExpand audioExpand7 = this.audioExpand;
        q.a(audioExpand7);
        audioExpand7.layout(a3, a4, true);
        AudioExpand audioExpand8 = this.audioExpand;
        q.a(audioExpand8);
        audioExpand8.showOpenTranslateAnimation(true);
    }

    private final void collapse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa509b4", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        q.a(audioExpand);
        audioExpand.setVisibility(4);
        AudioCollapse audioCollapse = this.audioCollapse;
        q.a(audioCollapse);
        audioCollapse.setVisibility(0);
    }
}
