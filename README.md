# ManeuverManager

## Overview

本リポジトリはテーブルトークRPGの1つである"永い後日談のネクロニカ"のマニューバを管理するためのプロジェクトです. / This repository is a project to manage the maneuvers of the TRPG "永い後日談のネクロニカ".  

## Description

本プロジェクトの基本的な機能はドールの管理です. / The basic function is to manage the maneuvers of each player character.  

登録するマニューバは公式・非公式どちらも登録できますが、非公式のマニューバを追加したい場合は参加するセッションのゲームマスターに承認を得てください. / Maneuvers can be selected officially or unofficially, so if you wish to add an unofficial maneuver, please ask the Game Master of the session you are participating in for approval.  

インフラ構成図・DBのER図はsrc直下のdocsディレクトリを参照してください. / Please refer to the docs directory directly under src/ for the infrastructure configuration and DB ER diagrams.

## Requirement

* Java - openjdk version "11.0.9.1" 2020-11-04
* Gradle - 7.3.3
* Mysql - 8.0.28

## Usage

プロジェクトが進行中のため、こちらの項目は未執筆です. / This item has not been written yet because the project is still in progress. 

## Install

[Homebrew](https://brew.sh/index_ja)を事前にインストールしている場合、下記の操作は不要です. / If you have already installed [Homebrew](https://brew.sh/index_ja), you do not need to install the following.

```bash
$ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

最初に Java11 をインストールします. / Install Java version 11 first. 

```bash
$ brew install java11
```

次に Gradle をインストールします. / Next, install Gradle.

```bash
$ brew install gradle
```

最後に MySQL をインストールします. / Last, install MySQL.
```bash
$ brew install mysql@8.0
```

## Run

```bash
$ cd ManeuverManager
$ ./gradlew bootrun
```


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
