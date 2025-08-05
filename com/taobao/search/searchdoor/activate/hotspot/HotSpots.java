package com.taobao.search.searchdoor.activate.hotspot;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class HotSpots extends ActivateTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private boolean preload;
    private String tabKey;
    private List<c> tabs;
    private String trendRuleText;
    private String trendRuleUrl;
    private boolean validExposureSent;

    static {
        kge.a(-2024990501);
    }

    public static /* synthetic */ HotSpots copy$default(HotSpots hotSpots, boolean z, List list, String str, String str2, String str3, String str4, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpots) ipChange.ipc$dispatch("1745dcdf", new Object[]{hotSpots, new Boolean(z), list, str, str2, str3, str4, new Boolean(z2), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            z = hotSpots.preload;
        }
        List<c> list2 = list;
        if ((i & 2) != 0) {
            list2 = hotSpots.tabs;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = hotSpots.name;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = hotSpots.trendRuleText;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = hotSpots.trendRuleUrl;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = hotSpots.tabKey;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z2 = hotSpots.validExposureSent;
        }
        return hotSpots.copy(z, list3, str5, str6, str7, str8, z2);
    }

    public final boolean component1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f047d5f", new Object[]{this})).booleanValue() : this.preload;
    }

    public final List<c> component2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d8d369eb", new Object[]{this}) : this.tabs;
    }

    public final String component3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b05ede3", new Object[]{this}) : this.name;
    }

    public final String component4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("118ba882", new Object[]{this}) : this.trendRuleText;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98116321", new Object[]{this}) : this.trendRuleUrl;
    }

    public final String component6() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e971dc0", new Object[]{this}) : this.tabKey;
    }

    public final boolean component7() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f590a65", new Object[]{this})).booleanValue() : this.validExposureSent;
    }

    public final HotSpots copy(boolean z, List<c> list, String str, String str2, String str3, String str4, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HotSpots) ipChange.ipc$dispatch("fe760aa7", new Object[]{this, new Boolean(z), list, str, str2, str3, str4, new Boolean(z2)}) : new HotSpots(z, list, str, str2, str3, str4, z2);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof HotSpots) {
                HotSpots hotSpots = (HotSpots) obj;
                if (this.preload != hotSpots.preload || !q.a(this.tabs, hotSpots.tabs) || !q.a((Object) this.name, (Object) hotSpots.name) || !q.a((Object) this.trendRuleText, (Object) hotSpots.trendRuleText) || !q.a((Object) this.trendRuleUrl, (Object) hotSpots.trendRuleUrl) || !q.a((Object) this.tabKey, (Object) hotSpots.tabKey) || this.validExposureSent != hotSpots.validExposureSent) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        boolean z = this.preload;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i2 * 31;
        List<c> list = this.tabs;
        int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.trendRuleText;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.trendRuleUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tabKey;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i5 = (hashCode4 + i) * 31;
        boolean z2 = this.validExposureSent;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        return i5 + i6;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpots(preload=" + this.preload + ", tabs=" + this.tabs + ", name=" + this.name + ", trendRuleText=" + this.trendRuleText + ", trendRuleUrl=" + this.trendRuleUrl + ", tabKey=" + this.tabKey + ", validExposureSent=" + this.validExposureSent + riy.BRACKET_END_STR;
    }

    public final boolean getPreload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3880cde", new Object[]{this})).booleanValue() : this.preload;
    }

    public final void setPreload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c33c46", new Object[]{this, new Boolean(z)});
        } else {
            this.preload = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HotSpots(boolean r7, java.util.List r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.o r15) {
        /*
            r6 = this;
            r0 = r14 & 2
            if (r0 == 0) goto L8
            r0 = 0
            java.util.List r0 = (java.util.List) r0
            goto L9
        L8:
            r0 = r8
        L9:
            r1 = r14 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L11
            r1 = r2
            goto L12
        L11:
            r1 = r9
        L12:
            r3 = r14 & 8
            if (r3 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r10
        L19:
            r4 = r14 & 16
            if (r4 == 0) goto L1f
            r4 = r2
            goto L20
        L1f:
            r4 = r11
        L20:
            r5 = r14 & 32
            if (r5 == 0) goto L25
            goto L26
        L25:
            r2 = r12
        L26:
            r5 = r14 & 64
            if (r5 == 0) goto L2c
            r5 = 0
            goto L2d
        L2c:
            r5 = r13
        L2d:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r2
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.activate.hotspot.HotSpots.<init>(boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.o):void");
    }

    public final List<c> getTabs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e58aa66c", new Object[]{this}) : this.tabs;
    }

    public final void setTabs(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56510678", new Object[]{this, list});
        } else {
            this.tabs = list;
        }
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final String getTrendRuleText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e65939a9", new Object[]{this}) : this.trendRuleText;
    }

    public final void setTrendRuleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196ddd55", new Object[]{this, str});
        } else {
            this.trendRuleText = str;
        }
    }

    public final String getTrendRuleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1aeb678d", new Object[]{this}) : this.trendRuleUrl;
    }

    public final void setTrendRuleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31ffe89", new Object[]{this, str});
        } else {
            this.trendRuleUrl = str;
        }
    }

    public final String getTabKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33abb979", new Object[]{this}) : this.tabKey;
    }

    public final void setTabKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e175631d", new Object[]{this, str});
        } else {
            this.tabKey = str;
        }
    }

    public final boolean getValidExposureSent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c39ee0b0", new Object[]{this})).booleanValue() : this.validExposureSent;
    }

    public final void setValidExposureSent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28183b4", new Object[]{this, new Boolean(z)});
        } else {
            this.validExposureSent = z;
        }
    }

    public HotSpots(boolean z, List<c> list, String str, String str2, String str3, String str4, boolean z2) {
        this.preload = z;
        this.tabs = list;
        this.name = str;
        this.trendRuleText = str2;
        this.trendRuleUrl = str3;
        this.tabKey = str4;
        this.validExposureSent = z2;
    }
}
