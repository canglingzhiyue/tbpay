"use strict";
var mOriginRelationFriendList = [];
var mOriginSelectedUser;
var main = function main(data) {
    var input = isString(data) ? JSON.parse(data) : data;
    var state = bizExecute(input);
    var result = makeOutputParamsCorrect(state);
    var retStr = JSON.stringify({
        method: 'main',
        methodReturn: result
    });
    var platform = input.platform;
    if (platform === 'AndroidOld') {
        try {
            AndroidWebViewEngineInterface.onReceiveValue(retStr);
        } catch (e) {
            var msg = ("AndroidOld return error: " + e.stack);
            nativeBridgeCall("umbrellaAlarm", "alarm001", msg);
        }
    } else if (platform === 'Android') {
        return retStr;
    } else {
        return result;
    }
    return data;
};
var makeOutputParamsCorrect = function makeOutputParamsCorrect(output) {
    var result = {
        bizState: {},
        initialState : {},
        storedState : {}
    };
    if (isEmpty(output))
        return result;
    if (!isEmpty(output.bizData))
        result.bizState = output.bizData;
    if (!isEmpty(output.initialState))
        result.initialState = output.initialState;
    if (!isEmpty(output.storedState))
        result.storedState = output.storedState;
    if (isEmpty(result.bizState))
        result.bizState = {};
    return result;
};
var bizExecute = function bizExecute(input) {
    var state = {
        bizData : {},
        storedState : {}
    };

    state.storedState = input.storedState;

    if(null == mOriginRelationFriendList || mOriginRelationFriendList.length === 0) {
        mOriginRelationFriendList = input.storedState.initialState.relationFriendList;
        if(!isEmpty(mOriginRelationFriendList)) {
            mOriginSelectedUser = mOriginRelationFriendList[0];
        }
    }
    state.bizData.searchPhoneNumber = "";
    state.bizData.inputCloseShow=false;
    state.bizData.fromSearch="false";
    state.bizData = input.storedState.bizData ? input.storedState.bizData : handleBizData(input.storedState.initialState);
    if (!isEmpty(input.opState)) {
        var opState = input.opState;
        var opStateType = opState.type;
        if (opStateType === "userSelect") {
            var userList = handleUserSelect(opState, state.bizData);
            if (!isEmpty(userList)) {
                state.bizData.relationFriendList = userList;
            }
        } else if (opStateType === "chargeSelect") { //充值金额互斥
            var toShipItems = handleChargeSelect(opState, state.bizData);
            if (!isEmpty(toShipItems)) {
                state.bizData.commoditiesVO.toShipItems = toShipItems;
            }
        } else if (opStateType === "searchUserList") {
            var searchUserList = handleUserSearch(opState);
            if(null != opState.eventData) {
                state.bizData.searchPhoneNumber = state.storedState.textInputChanged.wallet_phone_number;
            }

            if(isEmpty(searchUserList)) {
                state.bizData.inputCloseShow=false;
            } else {
                //不为空的时候才刷新
                state.bizData.relationFriendList = searchUserList;
                //搜索的情况不要默认选中
                updateSelectedUser(state.bizData, null);
                state.bizData.inputCloseShow=true;
                state.bizData.fromSearch="true";
            }
        } else if("clearSearchUser" === opStateType) {
            state.bizData.searchPhoneNumber="";
            state.storedState.textInputChanged.wallet_phone_number="";
            state.bizData.inputCloseShow=false;
            state.bizData.relationFriendList = mOriginRelationFriendList;
            updateSelectedUser(state.bizData, mOriginSelectedUser);
        } else if("searchUserListWithEmptyResponse" === opStateType) {
            if(state.storedState.textInputChanged) {
                state.bizData.searchPhoneNumber = state.storedState.textInputChanged.wallet_phone_number;
            }
            state.bizData.inputCloseShow=true;
            state.bizData.relationFriendList = mOriginRelationFriendList;
            updateSelectedUser(state.bizData, mOriginSelectedUser);
        }
    }
    state.bizData.toShipItemsStr = JSON.stringify(state.bizData.commoditiesVO.toShipItems);
    return state;
};
function updateSelectedUser(bizData, selectedUser) {
    bizData.selctedFriend = selectedUser;
    if(null == selectedUser) {
        bizData.selctedFriendId = "-1";
    } else {
        bizData.selctedFriendId = selectedUser.recommendFriendUserId;
    }
}
var handleBizData = function handleBizData(initialState) {
    var bizData = initialState;
    bizData.selctedFriendId = "-1";
    bizData.selctedShipItemId = "-1";
    if (bizData.chargeEventVO.selectedId) {
        bizData.commoditiesVO.toShipItems.forEach(function (item, index) {
            if (item.id === bizData.chargeEventVO.selectedId) {
                bizData.selctedShipItem = item;
                bizData.selctedShipItemId = item.id;
            }
        })
    }
    bizData.relationFriendList.forEach(function (user, index) {
        if (user.selected === "true") {
            bizData.selctedFriend = user;
            bizData.selctedFriendId = user.recommendFriendUserId;
        }
    })
    return bizData;
}
var handleUserSelect = function handleUserSelect(opState, bizData) {
    if (isEmpty(opState.extraParams) || !isArray(opState.extraParams)) {
         return null;
    }
    var params = opState.extraParams[0];
    bizData.relationFriendList.forEach(function (user, index) {
        if (user.recommendFriendUserId === params.recommendFriendUserId) {
            if ("true" === user.fakeSelected)
                user.fakeSelected = "false";
            else
                user.fakeSelected = "true";
            user.selected = "true";
            bizData.selctedFriend = user;
            bizData.selctedFriendId = user.recommendFriendUserId;
        } else {
            user.selected = "false";
        }
    })
    return bizData.relationFriendList;
};
var handleUserSearch = function handleUserSearch(opState) {
    var eventData = opState.eventData;
    if(null == eventData) {
        return [];
    }
    var friendList = eventData.relationFriendList;
    if(null == friendList) {
        return [];
    }
    return eventData.relationFriendList;
};
var handleChargeSelect = function handleChargeSelect(opState, bizData) {
    if (isEmpty(opState.extraParams) || !isArray(opState.extraParams)) {
         return null;
    }
    var params = opState.extraParams[0];
    bizData.commoditiesVO.toShipItems.forEach(function (item, index) {
        if (item.id === params.id) {
            bizData.chargeEventVO.selectedId = item.id;
            bizData.selctedShipItem = item;
            bizData.selctedShipItemId = item.id;
        }
    })
};
var isString = function isString(data) {
    return typeof data === "string";
};
var isArray = function isArray(data) {
    return _typeof(data) === "object" && Object.prototype.toString.call(data) === "[object Array]";
};
var isEmpty = function isEmpty(data) {
    var dataType = _typeof(data);
    switch (dataType) {
        case "number":
              return isNaN(data);
        case "string":
              return null === data || data.length === 0 || data.trim().length === 0;
        case "boolean":
            return false;
        case "object":
            if (data === null) {
                return true;
            } else {
                for (var key in data) {
                    return false;
                }
                return true;
            }
        case "function":
            return false;
        case "undefined":
            return true;
        default:
            return true;
    }
};
function _typeof(obj) {
    if (typeof Symbol === "function" && typeof Symbol.iterator === "symbol") {
        _typeof = function _typeof(obj) {
            return typeof obj;
        };
    } else {
        _typeof = function _typeof(obj) {
            return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj;
        };
    }
    return _typeof(obj);
}