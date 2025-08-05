package com.alibaba.security.realidentity.service.track;

import android.content.Context;
import com.alibaba.security.realidentity.e4;
import com.alibaba.security.realidentity.f4;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class RPTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class LastExitTrackParams implements Serializable {
        public String url;
    }

    /* loaded from: classes3.dex */
    public static class TrackStrategy implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mTrackCacheSize;

        /* loaded from: classes3.dex */
        public static class Builder implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public int mTrackCacheSize;

            public TrackStrategy build() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TrackStrategy) ipChange.ipc$dispatch("d7620ac2", new Object[]{this}) : new TrackStrategy(this.mTrackCacheSize);
            }

            public Builder setTrackCacheSize(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("39a9e618", new Object[]{this, new Integer(i)});
                }
                this.mTrackCacheSize = i;
                return this;
            }
        }

        public TrackStrategy(int i) {
            this.mTrackCacheSize = i;
        }

        public int getTrackCacheSize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f134008", new Object[]{this})).intValue() : this.mTrackCacheSize;
        }
    }

    public static void a(Context context, TrackStrategy trackStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd1b87d", new Object[]{context, trackStrategy});
        } else {
            e4.d().a(context, trackStrategy);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            e4.d().f();
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            e4.d().g();
        }
    }

    public static void a(Context context, f4 f4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec6547c", new Object[]{context, f4Var});
            return;
        }
        e4.d().a(context, (TrackStrategy) null);
        e4.d().a(f4Var);
    }

    public static void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{trackLog});
        } else {
            e4.d().a(trackLog);
        }
    }

    public static void a(LastExitTrackMsg lastExitTrackMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbbb8c4", new Object[]{lastExitTrackMsg});
        } else {
            e4.d().a(lastExitTrackMsg);
        }
    }

    public static LastExitTrackMsg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LastExitTrackMsg) ipChange.ipc$dispatch("5fabe20a", new Object[0]) : e4.d().e();
    }
}
