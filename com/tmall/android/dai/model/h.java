package com.tmall.android.dai.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.model.g;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class h extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String e;
    private g.a f;
    private g.a g;
    private g.a h;
    private g.a i;
    private Map<String, g.a> j;
    private ArrayList<String> k;

    static {
        kge.a(-31725082);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == -1968821097) {
            return super.a((UserTrackDO) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto Lfa
            int r0 = r5.size()
            if (r0 > 0) goto Ld
            goto Lfa
        Ld:
            java.lang.String r0 = "eid"
            java.lang.Object r0 = r5.get(r0)
            r1 = 0
            if (r0 == 0) goto L2c
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L21
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L2d
        L21:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L2c
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = r0.intValue()
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r4.f23723a = r0
            java.lang.String r0 = "owner_id"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.b = r0
            java.lang.String r0 = "batch"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L57
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L4d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            goto L57
        L4d:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L57
            java.lang.Long r0 = (java.lang.Long) r0
            int r1 = r0.intValue()
        L57:
            r4.c = r1
            java.lang.String r0 = "pg"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L6f
            com.tmall.android.dai.model.g$a r1 = new com.tmall.android.dai.model.g$a
            r1.<init>(r0)
            r4.f = r1
        L6f:
            java.lang.String r0 = "arg1"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L84
            com.tmall.android.dai.model.g$a r1 = new com.tmall.android.dai.model.g$a
            r1.<init>(r0)
            r4.g = r1
        L84:
            java.lang.String r0 = "arg2"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L99
            com.tmall.android.dai.model.g$a r1 = new com.tmall.android.dai.model.g$a
            r1.<init>(r0)
            r4.h = r1
        L99:
            java.lang.String r0 = "arg3"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto Lae
            com.tmall.android.dai.model.g$a r1 = new com.tmall.android.dai.model.g$a
            r1.<init>(r0)
            r4.i = r1
        Lae:
            java.lang.String r0 = "args"
            java.lang.Object r5 = r5.get(r0)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto Lfa
            int r0 = r5.size()
            if (r0 <= 0) goto Lfa
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.j = r0
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lcd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lfa
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 != 0) goto Lcd
            java.util.Map<java.lang.String, com.tmall.android.dai.model.g$a> r1 = r4.j
            java.lang.Object r2 = r0.getKey()
            com.tmall.android.dai.model.g$a r3 = new com.tmall.android.dai.model.g$a
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r0)
            r1.put(r2, r3)
            goto Lcd
        Lfa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.model.h.<init>(java.util.Map):void");
    }

    @Override // com.tmall.android.dai.model.g
    public TriggerMatchResult a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("8aa62c97", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult a2 = super.a(userTrackDO);
        if (!super.a(userTrackDO).f23726a) {
            return a2;
        }
        g.a aVar = this.f;
        if (aVar != null && !aVar.a(userTrackDO.getPageName())) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page not match");
        }
        g.a aVar2 = this.g;
        if (aVar2 != null && !aVar2.a(userTrackDO.getArg1())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode, "arg1 not match required" + this.g.b() + " but found" + userTrackDO.getArg1());
        }
        g.a aVar3 = this.h;
        if (aVar3 != null && !aVar3.a(userTrackDO.getArg2())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode2, "arg2 not match required" + this.h.b() + " but found" + userTrackDO.getArg2());
        }
        g.a aVar4 = this.i;
        if (aVar4 != null && !aVar4.a(userTrackDO.getArg3())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode3, "arg2 not match required" + this.i.b() + " but found" + userTrackDO.getArg3());
        }
        if (this.j != null && userTrackDO.getArgs() != null) {
            if (this.j.size() > userTrackDO.getArgs().size()) {
                TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode4 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
                return TriggerMatchResult.a(triggerMatchResultCode4, "args not match required size " + this.j.size() + " but ut size is " + userTrackDO.getArgs().size());
            }
            for (Map.Entry<String, g.a> entry : this.j.entrySet()) {
                if (!entry.getValue().a(userTrackDO.getArgs().get(entry.getKey()))) {
                    TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode5 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
                    return TriggerMatchResult.a(triggerMatchResultCode5, "args not match for key " + entry.getKey() + "  required " + entry.getValue().b() + " but found" + userTrackDO.getArgs().get(entry.getKey()));
                }
            }
        }
        return TriggerMatchResult.a();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        sb.append(super.toString());
        String str6 = "";
        if (this.e != null) {
            str = "triId='" + this.e + '\'';
        } else {
            str = str6;
        }
        sb.append(str);
        if (this.f != null) {
            str2 = ", pageName=" + this.f;
        } else {
            str2 = str6;
        }
        sb.append(str2);
        if (this.g != null) {
            str3 = ", arg1=" + this.g;
        } else {
            str3 = str6;
        }
        sb.append(str3);
        if (this.h != null) {
            str4 = ", arg2=" + this.h;
        } else {
            str4 = str6;
        }
        sb.append(str4);
        if (this.i != null) {
            str5 = ", arg3=" + this.i;
        } else {
            str5 = str6;
        }
        sb.append(str5);
        if (this.j != null) {
            str6 = ", args=" + this.j;
        }
        sb.append(str6);
        sb.append('}');
        return sb.toString();
    }

    @Override // com.tmall.android.dai.model.g
    public ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<String> arrayList = this.k;
        if (arrayList != null) {
            return arrayList;
        }
        this.k = new ArrayList<>();
        g.a aVar = this.f;
        if (aVar != null && !aVar.a()) {
            ArrayList<String> arrayList2 = this.k;
            arrayList2.add("" + this.f23723a + "#" + this.f.b());
        } else {
            ArrayList<String> arrayList3 = this.k;
            arrayList3.add("" + this.f23723a);
        }
        return this.k;
    }
}
