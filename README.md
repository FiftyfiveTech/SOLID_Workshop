# SOLID_Workshop

<span style="width:100%">[![forthebadge](https://forthebadge.com/images/badges/built-by-developers.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/powered-by-coffee.svg)](https://forthebadge.com)
</span>

<span style="width:100%">[![forthebadge](https://forthebadge.com/images/badges/0-percent-optimized.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/powered-by-responsibility.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/uses-badges.svg)](https://forthebadge.com)
</span>

## About the Workshop 

We are here with a workshop which aims at providing you an understanding of SOLID principles via examples taken from various sources. This workshop will help you make code cleaner, more flexible, and easier to change.

We will have a look at how SOLID principles help you in building beautifully designed code bases that stand the test of time. Then we will get our hands dirty by diving into some code snippets and applying SOLID principles to them with our learning.

## Takeaways from this Workshop

* Better understanding on SOLID principles.
* Choose better object oriented approaches when developing.
* Fun!

## Structure of the Repository

* This repository contains multiple branches named according to your teams. Ex- `team-A`, `team-B` etc.
* All the branches contain a set of similar probelms.

## Steps to participate :boom:

#### 1) `Fork` this repository.(Incase facing issue, follow this documentation) and `clone` it.
#### 2) Checkout to your branch. (According to `group` you belong).
#### 3) Refactor the problems in the same place.
#### 4) Create a `PR` [ Pull Request ] targeted to the same branch.
#### 5) You have successfully participated.
#### 6) Sit back and relax.

## Methods of Participation

* Using `Web UI` [💻ui](#participation-via-web-ui)

* Using `GitHub CLI`
  *   For Mac Users [Mac](#participation-via-github-cli-for-macos)
  *   For Windows [🪟Win](#participation-via-github-cli-for-windows)
  *   For Linux [🐧Linux](#participation-via-github-cli-for-linux)

## Participation via `Web UI`

* How to `Fork` a repo. Click [here](https://docs.github.com/en/get-started/quickstart/fork-a-repo) 
* How to Create a `pull request`.Click [here](https://docs.github.com/en/github/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)

## Participation via `Github CLI`: For Windows

* Click [here](https://github.com/cli/cli/releases/download/v1.11.0/gh_1.11.0_windows_amd64.msi) to download the `gh cli` tool.
* After installing open powershell.
* `gh auth login` 

## Participation via `Github CLI`: For MacOS

* `brew install gh`
* `gh auth login`

## Participation via `GitHub CLI`: For Linux

For all the nerds who want to learn and explore more of `GitHub CLI` please follow along. If you have already installed `gh cli` you can skip to the second section.

Installing `gh cli` [link](https://github.com/cli/cli/blob/trunk/docs/install_linux.md)

```bash 

curl -fsSL https://cli.github.com/packages/githubcli-archive-keyring.gpg | sudo gpg --dearmor -o /usr/share/keyrings/githubcli-archive-keyring.gpg

echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/githubcli-archive-keyring.gpg] https://cli.github.com/packages stable main" | sudo tee /etc/apt/sources.list.d/github-cli.list > /dev/null

sudo apt update

sudo apt install gh

gh auth login
```

![GH Install Gif](gifs/installGH.gif)
 *`Installation of gh command line in linux`*

After successful installation of `gh cli`, it is now time to start the task at hand. 

```bash
# Clone the repo 
git clone https://github.com/Imsurajkr/cleancodeworkshop.git

# Navigate into the root of the repo.
cd cleancodeworkshop

# Fork the repo.
gh repo fork 

parentBranch={GroupName} # Replace {GroupName} with your group 
candidateName={MemberName} # Replace {MemberName} with your name (no spaces recommended)
branchName="$parentBranch-$candidateName"
git checkout -b $branchName

# All set! add your magic...
# When done
git pull 
git add <FilesChanged> 
git commit -m "Customized Message"
git push 

# Raise PR
gh pr create --title "I did some changes" --body "And it works" --base <branchName> # The branch into which you want your code merged

# All the best :-)
```
![GH Install Gif](gifs/forkGH.gif)

*Sample video demonstration on how to  `fork`, `branch`, add, commit, push, and `generating PR`*

![PR Raised](gifs/pr_created.png)

*Screenshot of PR creation*
