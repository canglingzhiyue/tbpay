package com.taobao.uikit.actionbar;

import tb.kge;

/* loaded from: classes9.dex */
public class MenuContract {
    public static final int CUSTOMS = 2;
    public static final int DEFAULT = 1;
    public static final int SHARE = 0;

    /* loaded from: classes9.dex */
    interface ActionBarBasePresenter {
        void close();

        void notifyMenuChanged();

        void pause();

        void show(TBActionView tBActionView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface ActionBarBaseView {
        void addMenuAdapter(int i, PublicMenuAdapterV2 publicMenuAdapterV2);

        void close();

        void notifyMenuChanged();

        void onPause();

        void registerOnDismissListener(OnDismissListener onDismissListener);

        void show(TBActionView tBActionView);
    }

    /* loaded from: classes9.dex */
    public interface OnDismissListener {
        void onDismiss(ActionBarBaseView actionBarBaseView);
    }

    static {
        kge.a(-1021159677);
    }
}
