package com.alibaba.security.realidentity.ui;

import com.alibaba.security.realidentity.ui.activity.TransitionMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ALBiometricsConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient boolean DEFAULT_NEED_SOUND = true;
    public static final transient TransitionMode DEFAULT_TRANSITION_MODE = TransitionMode.NULL;
    public boolean isNeedFailResultPage;
    public final boolean isNeedSound;
    public final boolean isShouldAlertOnExit;
    public boolean mIsSkinInAssets;
    public final String skinPath;
    public final TransitionMode transitionMode;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TransitionMode f3532a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public String f;
        public boolean g;

        public a() {
            this.f3532a = ALBiometricsConfig.DEFAULT_TRANSITION_MODE;
            this.b = true;
            this.d = true;
        }

        public a a(TransitionMode transitionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4e2448b", new Object[]{this, transitionMode});
            }
            this.f3532a = transitionMode;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7efe67a1", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        @Deprecated
        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd5f6b80", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7bc06f5f", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa21733e", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7882771d", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43b83908", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d63c2", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public ALBiometricsConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ALBiometricsConfig) ipChange.ipc$dispatch("e07c1edb", new Object[]{this}) : new ALBiometricsConfig(this);
        }

        public a(ALBiometricsConfig aLBiometricsConfig) {
            this.f3532a = aLBiometricsConfig.transitionMode;
            this.b = aLBiometricsConfig.isNeedSound;
            this.d = aLBiometricsConfig.isShouldAlertOnExit;
        }
    }

    public ALBiometricsConfig() {
        this(new a());
    }

    public String getSkinPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b2cdd41", new Object[]{this}) : this.skinPath;
    }

    public TransitionMode getTransitionMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransitionMode) ipChange.ipc$dispatch("8c2572e", new Object[]{this}) : this.transitionMode;
    }

    public boolean isNeedFailResultPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86204695", new Object[]{this})).booleanValue() : this.isNeedFailResultPage;
    }

    public boolean isNeedSound() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ce4651a", new Object[]{this})).booleanValue() : this.isNeedSound;
    }

    public boolean isShouldAlertOnExit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9fb2ae7", new Object[]{this})).booleanValue() : this.isShouldAlertOnExit;
    }

    public boolean isSkinInAssets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d012a0fa", new Object[]{this})).booleanValue() : this.mIsSkinInAssets;
    }

    public a newBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c9e199b8", new Object[]{this}) : new a(this);
    }

    public ALBiometricsConfig(a aVar) {
        this.isNeedFailResultPage = true;
        this.transitionMode = aVar.f3532a;
        this.isNeedSound = aVar.b;
        this.isShouldAlertOnExit = aVar.d;
        this.skinPath = aVar.f;
        this.mIsSkinInAssets = aVar.g;
        this.isNeedFailResultPage = aVar.e;
    }
}
