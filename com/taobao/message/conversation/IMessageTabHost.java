package com.taobao.message.conversation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public interface IMessageTabHost {
    IMessageTabHost getInner();

    void onArguments(Bundle bundle);

    void onAttach(Context context);

    void onCreate(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onViewCreated(View view, Bundle bundle);
}
