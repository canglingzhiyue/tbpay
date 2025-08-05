package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;
import java.io.File;

/* loaded from: classes.dex */
public class old implements okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-332973349);
        kge.a(-2073055194);
    }

    @Override // tb.okv
    public okv a(final jhg jhgVar) {
        jhv jhvVar;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okv) ipChange.ipc$dispatch("c57c657d", new Object[]{this, jhgVar});
        }
        final String a2 = jhz.a();
        jhgVar.g = a2;
        TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_REQ, UploadFileType.UDF, UploadReason.SERVER_PULL, a2);
        f.a().h().a(oko.c, a2, "[UDF] Receive Server Request......");
        try {
            jhvVar = new jhv();
            jhvVar.a(jhgVar.m, jhgVar);
            str = jhvVar.f29566a;
            str2 = jhvVar.b;
        } catch (Exception e) {
            String value = ErrorCode.CODE_EXC.getValue();
            String str3 = "[UDF] Exception: " + e.getMessage();
            olc.a(jhgVar, value, str3);
            TLogEventHelper.a(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value, str3, a2);
            f.a().h().a(oko.c, a2, e);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && "USER_UPLOAD".equals(str)) {
            final olo oloVar = f.a().f.get(str2);
            if (oloVar != null && str2.equals(oloVar.getBizCode())) {
                f.a().h().a(oko.c, a2, "[UDF] Execute upload task for: " + str2);
                olr olrVar = new olr();
                olrVar.f32159a = jhvVar.c;
                oloVar.executeUploadTask(f.a().j(), olrVar, new olp() { // from class: tb.old.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.olp
                    public Boolean a(olq olqVar) {
                        String str4;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Boolean) ipChange2.ipc$dispatch("e532f4a1", new Object[]{this, olqVar});
                        }
                        if (olqVar == null || TextUtils.isEmpty(olqVar.b) || olqVar.f32158a == null || olqVar.f32158a.isEmpty()) {
                            String value2 = ErrorCode.DATA_EMPTY.getValue();
                            if (olqVar != null) {
                                value2 = olqVar.d;
                                str4 = olqVar.e;
                            } else {
                                str4 = "[UDF] Upload file list is empty";
                            }
                            String str5 = value2;
                            olc.a(jhgVar, str5, str4);
                            TLogEventHelper.a(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, str5, str4, a2);
                            f.a().h().b(oko.c, a2, str4);
                            return false;
                        }
                        return b(olqVar);
                    }

                    private Boolean b(final olq olqVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Boolean) ipChange2.ipc$dispatch("fa1bbce2", new Object[]{this, olqVar});
                        }
                        f.a().h().a(oko.h, a2, "[UDF] Perpare to upload file!");
                        olg.a(a2, UploadReason.SERVER_PULL, olqVar.f32158a, UploadFileType.UDF, "USER_UPLOAD", olqVar.b, olqVar.c, new olf() { // from class: tb.old.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.olf
                            public void a(String str4, String str5, String str6) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("929ad046", new Object[]{this, str4, str5, str6});
                                    return;
                                }
                                String format = String.format("[UDF] File upload filed! errCode：%s, errMsg: %s, file:%s", str5, str6, str4);
                                olc.a(jhgVar, str5, str6);
                                TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_ONE_ERROR, UploadFileType.UDF, UploadReason.SERVER_PULL, a2);
                                f.a().h().b(oko.c, a2, format);
                                oloVar.onUploadDone(false, str4);
                                if (!ErrorCode.TOKEN_REFUSE_ERROR.getValue().equals(str5) && !ErrorCode.TOKEN_REPLY_ERROR.getValue().equals(str5)) {
                                    return;
                                }
                                a();
                            }

                            @Override // tb.olf
                            public void a(String str4, String str5) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                                } else if (olh.ALL_DONE.equals(str4)) {
                                    a();
                                } else {
                                    olc.a(jhgVar);
                                    TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS, UploadFileType.UDF, UploadReason.SERVER_PULL, a2);
                                    okn h = f.a().h();
                                    String str6 = oko.c;
                                    String str7 = a2;
                                    h.a(str6, str7, "[UDF]File upload successfully: " + str4);
                                    oloVar.onUploadDone(true, str4);
                                }
                            }

                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (olqVar.f) {
                                    for (String str4 : olqVar.f32158a) {
                                        File file = new File(str4);
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                    }
                                }
                            }
                        });
                        return true;
                    }
                });
                return null;
            }
            String value2 = ErrorCode.NOT_IMPLEMENTED.getValue();
            String str4 = "[UDF] No Uploader for: " + str2;
            olc.a(jhgVar, value2, str4);
            TLogEventHelper.a(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value2, str4, a2);
            f.a().h().b(oko.c, a2, str4);
            return null;
        }
        String value3 = ErrorCode.BIZ_ERROR.getValue();
        String format = String.format("[UDF] The bizType:%s, bizCode:%s is invalid", str, str2);
        olc.a(jhgVar, value3, format);
        TLogEventHelper.a(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value3, format, a2);
        f.a().h().b(oko.c, a2, format);
        return null;
    }
}
