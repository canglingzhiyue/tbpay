package com.uc.webview.internal.setup.component;

import anet.channel.util.ErrorConstant;
import com.alibaba.android.split.model.SplitInstallErrorCode;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.taobao.artc.api.AConstants;
import com.uc.webview.base.cyclone.BSError;
import java.util.HashSet;
import tb.icf;

/* loaded from: classes9.dex */
interface h {

    /* loaded from: classes9.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(int i) {
            if (i != 0) {
                if (i == -1) {
                    return "加载默认库成功";
                }
                if (i == -457) {
                    return "未找到包信息";
                }
                if (i == -456) {
                    return "列表为空";
                }
                if (i == -251) {
                    return "File Ver 和 Url Ver 不匹配";
                }
                if (i == -250) {
                    return "MD5 不匹配";
                }
                if (i == -201) {
                    return "关键文件不存在";
                }
                if (i == -200) {
                    return "目录为空";
                }
                switch (i) {
                    case -10000:
                        return Configuration.IDLE;
                    case BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED /* -144 */:
                        return "Patch 失败";
                    case BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM /* -143 */:
                        return "Patch 成功";
                    case BSError.BSDIFF_PATCH_FILE_NOT_EXISTS /* -142 */:
                        return "兼容性检查";
                    case BSError.BSDIFF_PATCH_OPEN_DIR_FAILED /* -141 */:
                        return "开始 Patch";
                    case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC /* -140 */:
                        return "放弃升级(已执行)";
                    case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB /* -139 */:
                        return "需要的包都下载";
                    case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA /* -138 */:
                        return "需要的包都找到";
                    case BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE /* -137 */:
                        return "获取升级文件列表";
                    case -126:
                        return "已下载";
                    case BSError.BSDIFF_NEW_FILE_SIZE_MISMATC /* -125 */:
                        return "完成(发现包本地有效无需触发下载)";
                    case BSError.BSDIFF_NEW_FILE_INVALID_SIZE /* -124 */:
                        return "完成(下载了且本地有效)";
                    case BSError.BSDIFF_NEW_FILE_WRITE_FAILED /* -121 */:
                        return "完成";
                    case -118:
                        return "校验成功";
                    case -117:
                        return "校验开始";
                    case BSError.BSDIFF_OLD_FILE_DEC_FAILED /* -116 */:
                        return "解压异常";
                    case BSError.BSDIFF_OLD_FILE_MD5_MISMATCH /* -115 */:
                        return "解压失败";
                    case BSError.BSDIFF_OLD_FILE_SIZE_MISMATCB /* -114 */:
                        return "不执行解压(已存在)";
                    case BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA /* -113 */:
                        return "解压成功";
                    case -112:
                        return "解压开始";
                    case -111:
                        return "下载失败";
                    case -110:
                        return "下载失败(没有下载器)";
                    case BSError.BSDIFF_OOM /* -109 */:
                        return "下载结束";
                    case ErrorConstant.ERROR_GET_PROCESS_NULL /* -108 */:
                        return "下载开始";
                    case -107:
                        return "被 App 禁用";
                    case -106:
                        return "URL 已更改";
                    case -105:
                        return "收到 URL";
                    case -103:
                        return "等待 URL";
                    case -101:
                        return "开始";
                    case -100:
                        return "被触发";
                    case -28:
                        return "文件不存在(删除也失败)";
                    case -27:
                        return "32 位使用 64 位(删除也失败)";
                    case -26:
                        return "64 位使用 32 位(删除也失败)";
                    case -23:
                        return "文件不存在";
                    case -22:
                        return "32 位使用 64 位";
                    case SplitInstallErrorCode.SPLIT_MERGE_ERROR /* -21 */:
                        return "64 位使用 32 位";
                    case -16:
                        return "dlopen 失败(删除也失败)";
                    case -15:
                        return "不支持";
                    case -14:
                        return "连续发生崩溃";
                    case -13:
                        return "dlopen 失败";
                    case -12:
                        return "库无效(关键函数不存在)";
                    case -11:
                        return "加载默认库失败";
                    case -10:
                        return "未知错误";
                    case -9:
                        return icf.a.CONTROL_NAME_OK;
                    case 0:
                        return "加载组件库成功";
                    default:
                        switch (i) {
                            case -454:
                                return "找到包信息了";
                            case -453:
                                return "获取包文件";
                            case -452:
                                return "查找包信息";
                            case -451:
                                return "再次更新列表";
                            case -450:
                                return "更新列表";
                            default:
                                switch (i) {
                                    case ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR /* -403 */:
                                        return "Pars 类未找到";
                                    case ErrorConstant.ERROR_SSL_ERROR /* -402 */:
                                        return "IParsObserver 未找到";
                                    case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                                        return "getResource 异常";
                                    case -400:
                                        return "addObserver 异常";
                                    default:
                                        switch (i) {
                                            case -272:
                                                return "Patch 成功但兼容性检查失败";
                                            case -271:
                                                return "Patch 失败(旧文件不匹配)";
                                            case -270:
                                                return "Patch 失败需重新下载(新文件 MD5 错误)";
                                            default:
                                                switch (i) {
                                                    case -263:
                                                        return "拿不到完整下载列表";
                                                    case -262:
                                                        return "在黑名单";
                                                    case -261:
                                                        return "New SEQ 不匹配";
                                                    case -260:
                                                        return "Old SEQ 不匹配";
                                                    default:
                                                        switch (i) {
                                                            case AConstants.ArtcErrorCreatePcError /* -153 */:
                                                                return "onFoundBundle Task 异常";
                                                            case AConstants.ArtcErrorLeaveChannelTiemout /* -152 */:
                                                                return "checkUpgrade Task 异常";
                                                            case AConstants.ArtcErrorIceRecvCandidateTimeout /* -151 */:
                                                                return "startDownload Task 异常";
                                                            case AConstants.ArtcErrorIceCandidateGatheringTimeOut /* -150 */:
                                                                return "start Task 异常";
                                                            default:
                                                                switch (i) {
                                                                    case BSError.BSDIFF_PATCH_FILE_INVALID_VER /* -133 */:
                                                                        return "更新 Base 模式(CD)";
                                                                    case BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC /* -132 */:
                                                                        return "更新 Base 模式(因升级列表未找到，放弃升级)";
                                                                    case BSError.BSDIFF_PATCH_FILE_LOAD_FAILED /* -131 */:
                                                                        return "更新 Base 模式";
                                                                    case BSError.BSDIFF_PATCH_FILE_INVALID /* -130 */:
                                                                        return "升级模式";
                                                                    default:
                                                                        return "Unknown ".concat(String.valueOf(i));
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return "加载组件库成功";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int b(int i) {
            if (i == -457 || i == -456 || i == 0 || i == -1) {
                return 4;
            }
            if (i == -251 || i == -250 || i == -201 || i == -200) {
                return 6;
            }
            if (i == -125 || i == -124) {
                return 4;
            }
            switch (i) {
                case -454:
                case BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM /* -143 */:
                case BSError.BSDIFF_PATCH_FILE_NOT_EXISTS /* -142 */:
                case BSError.BSDIFF_PATCH_OPEN_DIR_FAILED /* -141 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC /* -140 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB /* -139 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA /* -138 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE /* -137 */:
                case BSError.BSDIFF_NEW_FILE_WRITE_FAILED /* -121 */:
                case -107:
                case -106:
                case -105:
                case -103:
                case -101:
                case -9:
                case 0:
                    return 4;
                case BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED /* -144 */:
                case BSError.BSDIFF_OLD_FILE_DEC_FAILED /* -116 */:
                case BSError.BSDIFF_OLD_FILE_MD5_MISMATCH /* -115 */:
                case -111:
                case -110:
                case -28:
                case -27:
                case -26:
                case -23:
                case -22:
                case SplitInstallErrorCode.SPLIT_MERGE_ERROR /* -21 */:
                case -16:
                case -15:
                case -14:
                case -13:
                case -12:
                case -11:
                case -10:
                    return 6;
                default:
                    switch (i) {
                        case ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR /* -403 */:
                        case ErrorConstant.ERROR_SSL_ERROR /* -402 */:
                        case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                        case -400:
                            return 6;
                        default:
                            switch (i) {
                                case -272:
                                case -271:
                                    return 6;
                                case -270:
                                    return 4;
                                default:
                                    switch (i) {
                                        case -263:
                                            return 4;
                                        case -262:
                                        case -261:
                                        case -260:
                                            return 6;
                                        default:
                                            switch (i) {
                                                case AConstants.ArtcErrorCreatePcError /* -153 */:
                                                case AConstants.ArtcErrorLeaveChannelTiemout /* -152 */:
                                                case AConstants.ArtcErrorIceRecvCandidateTimeout /* -151 */:
                                                case AConstants.ArtcErrorIceCandidateGatheringTimeOut /* -150 */:
                                                    return 6;
                                                default:
                                                    switch (i) {
                                                        case BSError.BSDIFF_PATCH_FILE_INVALID_VER /* -133 */:
                                                        case BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC /* -132 */:
                                                        case BSError.BSDIFF_PATCH_FILE_LOAD_FAILED /* -131 */:
                                                        case BSError.BSDIFF_PATCH_FILE_INVALID /* -130 */:
                                                            return 4;
                                                        default:
                                                            return 2;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final HashSet<Integer> f23910a;

        static {
            HashSet<Integer> hashSet = new HashSet<>();
            f23910a = hashSet;
            hashSet.add(0);
            f23910a.add(-1);
            f23910a.add(-11);
            f23910a.add(-12);
            f23910a.add(-13);
            f23910a.add(-14);
            f23910a.add(-16);
            f23910a.add(-21);
            f23910a.add(-22);
            f23910a.add(-23);
            f23910a.add(-26);
            f23910a.add(-27);
            f23910a.add(-28);
            f23910a.add(-101);
            f23910a.add(-103);
            f23910a.add(-105);
            f23910a.add(-106);
            f23910a.add(-107);
            f23910a.add(Integer.valueOf((int) ErrorConstant.ERROR_GET_PROCESS_NULL));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_MD5_MISMATCH));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_DEC_FAILED));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_WRITE_FAILED));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_INVALID_SIZE));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_SIZE_MISMATC));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_LOAD_FAILED));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_VER));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM));
            f23910a.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED));
            f23910a.add(-200);
            f23910a.add(-201);
            f23910a.add(-250);
            f23910a.add(-251);
            f23910a.add(-260);
            f23910a.add(-261);
            f23910a.add(-262);
            f23910a.add(-270);
            f23910a.add(-271);
            f23910a.add(-272);
            f23910a.add(-452);
            f23910a.add(-454);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean a(int i) {
            return f23910a.contains(Integer.valueOf(i));
        }
    }
}
