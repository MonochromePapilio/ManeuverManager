# ManeuverManager

This repository is a project to manage the maneuvers of the TRPG "永い後日談のネクロニカ".  
The basic function is to manage the maneuvers of each player character.  
Maneuvers can be selected officially or unofficially, so if you wish to add an unofficial maneuver, please ask the Game Master of the session you are participating in for approval.  

## DB

## users

This table is for managing users.

| 物理名 | データ型 | NULL | デフォルト値 |  キー  | 倫理名 | Extra
| ---- | ---- | ---- | ---- | ---- | ---- |---- |
|  id  |  INT  | NO | 0 | PRI | 固有ID | ---- |
|  created_at  |  DATETIME  | NO | now |---- | 作成日 | ---- |
|  updated_at  |  DATETIME  | NO | now |---- | 更新日 | ---- |
|  name  |  VARCHAR(256)  | NO | Empty Maneuver |---- | ユーザ名 | ---- |


## dolls

This table is for managing dolls.

| 物理名 | データ型 | NULL | デフォルト値 |  キー  | 倫理名 | Extra
| ---- | ---- | ---- | ---- | ---- | ---- |---- |
|  id  |  INT  | NO | 0 | PRI | 固有ID | ---- |
|  created_at  |  DATETIME  | NO | now |---- | 作成日 | ---- |
|  updated_at  |  DATETIME  | NO | now |---- | 更新日 | ---- |
|  name  |  VARCHAR(256)  | NO | Empty Maneuver |---- | ドール名 | ---- |
|  main_class  |  VARCHAR(256)  | NO | Empty Maneuver |---- | メインクラス | ---- |
|  sub_class  |  VARCHAR(256)  | NO | Empty Maneuver |---- | サブクラス | ---- |
|  additional_class  |  VARCHAR(256)  | NO | Empty Maneuver |---- | 追加クラス | ---- |
|  favoritism  |  INT  | NO | Empty Maneuver |---- | 寵愛点 | ---- |
|  memo  |  TEXT  | NO | Empty MEMO |---- | マニューバ名 | ---- |

### maneuvers 

This table is for managing maneuvers.

| 物理名 | データ型 | NULL | デフォルト値 |  キー  | 倫理名 | Extra
| ---- | ---- | ---- | ---- | ---- | ---- |---- |
|  id  |  INT  | NO | 0 | PRI | 固有ID | ---- |
|  created_at  |  DATETIME  | NO | now |---- | 作成日 | ---- |
|  updated_at  |  DATETIME  | NO | now |---- | 更新日 | ---- |
|  name  |  VARCHAR(256)  | NO | Empty Maneuver |---- | マニューバ名 | ---- |
|  category  |  TYNYINT  | NO | Empty Category |---- | カテゴリ | ---- |
|  part  |  TYNYINT  | NO | Empty parts |---- | 部位 | ---- |
|  is_timing  |  TYNYINT  | NO | Empty timing |---- | タイミング | ---- |
|  cost  |  INT  | NO | Empty cost |---- | コスト | ---- |
|  range  |  VARCHAR(16)  | NO | Empty range |---- | 射程 | ---- |
|  effect  |  TEXT  | NO | Empry effect |---- | 効果 | ---- |
|  favoritism  |  VARCHAR(128)  | NO | Empty source |---- | 消費する寵愛点 | ---- |
| is_Premising |  VARCHAR(16)  | NO | Empty premise | ---- | 前提フラグ | ---- |
| is_official |  TYNYINT(1)  | NO | Empty premise | ---- | 公式フラグ | ---- |
|  source  |  VARCHAR(128)  | NO | Empty source |---- | 取得元 | ---- |

## Usage

In development.