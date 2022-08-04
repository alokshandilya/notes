# Git and GitHub

## Push Local Repo to GitHub

```sh
git remote add origin https://github.com/**/**.git
```

- specifies adding a remote repository, with the specified URL, as an origin to local `git` repo.

```sh
git push --set-upstream origin main
```

- push main branch to the origin url, and set it as the default remote branch

## Git Pull

to get most recent changes to the local copy of repo

- pull is a combination of 2 different commands:
  - fetch (`fetch` gets all the change history of a tracked branch/repo)
  - merge (` merge` combines the current branch, with a specified branch)

```sh
git fetch origin
```

```sh
git merge origin/main
```

## Git Push

`git push origin`
