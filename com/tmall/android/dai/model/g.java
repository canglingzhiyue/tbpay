package com.tmall.android.dai.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class g implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23723a;
    public String b;
    public int c;
    public int d;

    static {
        kge.a(-2020993449);
        kge.a(-1944657401);
    }

    public abstract ArrayList<String> a();

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f23724a;
        private boolean b;
        private boolean c;
        private String d;

        static {
            kge.a(-1873518193);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b || this.c;
        }

        public a(String str) {
            this.f23724a = str;
            this.d = str;
            if (TextUtils.isEmpty(this.d)) {
                this.b = false;
                this.c = false;
                return;
            }
            if (this.d.startsWith(riy.MOD)) {
                this.d = this.d.substring(1);
                this.b = true;
            }
            if (!this.d.endsWith(riy.MOD)) {
                return;
            }
            String str2 = this.d;
            this.d = str2.substring(0, str2.length() - 1);
            this.c = true;
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            String str2 = this.d;
            if (str2 == null || str == null) {
                return false;
            }
            if (this.b && this.c) {
                return str.contains(str2);
            }
            if (this.b) {
                return str.endsWith(this.d);
            }
            if (this.c) {
                return str.startsWith(this.d);
            }
            return str.equals(this.d);
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PatternMatcher{" + this.f23724a + riy.BLOCK_END_STR;
        }
    }

    public TriggerMatchResult a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("8aa62c97", new Object[]{this, userTrackDO});
        }
        if (!a(this.b, userTrackDO.getOwnerId())) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_OWNER_NOT_MATCH, "");
        }
        if (this.f23723a != userTrackDO.getEventId()) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_EVENT_ID_NOT_MATCH, "eventId not matched");
        }
        return TriggerMatchResult.a();
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (TextUtils.equals(str.toLowerCase(), "${empty}")) {
            return TextUtils.isEmpty(str2);
        }
        return TextUtils.equals(str.toLowerCase(), "${!empty}") && !TextUtils.isEmpty(str2);
    }
}
