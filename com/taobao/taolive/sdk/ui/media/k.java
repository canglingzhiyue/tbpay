package com.taobao.taolive.sdk.ui.media;

import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class k implements AudioManager.OnAudioFocusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21937a;
    private AudioManager.OnAudioFocusChangeListener b;
    private IMediaPlayer c;

    static {
        kge.a(-310228224);
        kge.a(-1491822649);
    }

    public k(c cVar, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, IMediaPlayer iMediaPlayer) {
        this.f21937a = cVar;
        this.b = onAudioFocusChangeListener;
        this.c = iMediaPlayer;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.b;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
        c cVar = this.f21937a;
        if (cVar == null) {
            return;
        }
        cVar.a(this.c, i);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.b.equals(((k) obj).b);
        }
        return false;
    }
}
